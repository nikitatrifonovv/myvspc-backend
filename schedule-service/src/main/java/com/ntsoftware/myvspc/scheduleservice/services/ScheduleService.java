package com.ntsoftware.myvspc.scheduleservice.services;


import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleDay;
import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleWeek;

public interface ScheduleService {

    public ScheduleWeek getScheduleWeek(int group_id, int sub_group, int semester);
    ScheduleDay getSchDay(int group_id, int sub_group, int semester, int day);

}
