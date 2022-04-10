package com.ntsoftware.myvspc.scheduleservice.services.impl;

import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleDay;
import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleLesson;
import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleWeek;
import com.ntsoftware.myvspc.scheduleservice.entities.dao.CallsEntity;
import com.ntsoftware.myvspc.scheduleservice.repositories.CallsRepository;
import com.ntsoftware.myvspc.scheduleservice.repositories.DayOfWeekRepository;
import com.ntsoftware.myvspc.scheduleservice.repositories.LessonRepository;
import com.ntsoftware.myvspc.scheduleservice.repositories.LessonTypeRepository;
import com.ntsoftware.myvspc.scheduleservice.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    LessonRepository lessonRepository;

    @Autowired
    DayOfWeekRepository dayOfWeekRepository;

    @Autowired
    LessonTypeRepository lessonTypeRepository;

    @Autowired
    CallsRepository callsRepository;

    @Override
    public ScheduleWeek getScheduleWeek(int group_id, int sub_group, int semester) {

        ScheduleWeek week = new ScheduleWeek();

        for (int i = 1; i <= 7; i++) {

            var day_raw = lessonRepository.findAllByGroupAndSubgroupAndSemesterAndDayofweekOrderByNumberAsc(group_id,sub_group,semester,i);

            if (!day_raw.isEmpty()) {

                var day = new ScheduleDay(i);

                for (var l : day_raw) {

                    var l_calls = callsRepository.findById(l.getNumber()).get();

                    ScheduleLesson lesson = ScheduleLesson.Builder.newInstance()
                            .withName(l.getName())
                            .withType(lessonTypeRepository.findById(l.getType()).get().getName())
                            .withTeacher(l.getTeacher())
                            .withAudience(l.getAudience())
                            .withStart(l_calls.getStart())
                            .withEnd(l_calls.getEnd())
                            .withBreak(l_calls.get_break())
                            .build();

                    day.addLesson(lesson);
                }
                week.addDay(day);
            }
        }
        return week;
    }

    @Override
    public ScheduleDay getSchDay(int group_id, int sub_group, int semester, int day) {
        return getScheduleWeek(group_id,sub_group,semester).getDayByTag(day);
    }

    @Override
    public List<CallsEntity> getCallsString() {
        return callsRepository.findAll();
    }


}
