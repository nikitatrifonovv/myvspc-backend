package com.ntsoftware.myvspc.scheduleservice.controllers;

import com.google.gson.Gson;
import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleDay;
import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleWeek;
import com.ntsoftware.myvspc.scheduleservice.entities.dao.CallsEntity;
import com.ntsoftware.myvspc.scheduleservice.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("health")
    public String checkHealth(){
        return "Schedule service is working.";
    }

    @GetMapping("week")
    ScheduleWeek getWeek(@RequestParam(name = "group") Integer group,
                         @RequestParam(name = "subgroup") Integer subgroup,
                         @RequestParam(name = "semester") Integer semester) {

        return scheduleService.getScheduleWeek(group,subgroup,semester);
    }

    @GetMapping("day")
    ScheduleDay getDay(@RequestParam(name = "group") Integer group,
                       @RequestParam(name = "subgroup") Integer subgroup,
                       @RequestParam(name = "semester") Integer semester,
                       @RequestParam(name = "day") Integer day) {

        return scheduleService.getSchDay(group, subgroup, semester, day);
    }

    @GetMapping("calls")
    List<CallsEntity> getCalls() {
        return scheduleService.getCallsString();
    }



}
