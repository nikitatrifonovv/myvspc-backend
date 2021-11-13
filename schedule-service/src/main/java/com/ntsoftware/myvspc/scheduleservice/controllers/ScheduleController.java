package com.ntsoftware.myvspc.scheduleservice.controllers;

import com.google.gson.Gson;
import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleDay;
import com.ntsoftware.myvspc.scheduleservice.entities.ScheduleWeek;
import com.ntsoftware.myvspc.scheduleservice.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    Gson serializer = new Gson();

    @GetMapping("/get")
    ScheduleWeek getWeek(@RequestParam(name = "group") Integer group,
                         @RequestParam(name = "subgroup") Integer subgroup,
                         @RequestParam(name = "semester") Integer semester) {

        var sch = scheduleService.getScheduleWeek(group,subgroup,semester);

        return sch;
    }

    @GetMapping("/getd")
    ScheduleDay getDay(@RequestParam(name = "group") Integer group,
                       @RequestParam(name = "subgroup") Integer subgroup,
                       @RequestParam(name = "semester") Integer semester,
                       @RequestParam(name = "day") Integer day) {

        var sch = scheduleService.getSchDay(group, subgroup, semester, day);

        return sch;
    }



}
