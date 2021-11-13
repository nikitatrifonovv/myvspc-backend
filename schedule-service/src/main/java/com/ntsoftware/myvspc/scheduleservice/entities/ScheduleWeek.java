package com.ntsoftware.myvspc.scheduleservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ScheduleWeek {

    private Collection<ScheduleDay> days;

    public ScheduleWeek() {
        days = new ArrayList<>();
    }

    public ScheduleWeek(Collection<ScheduleDay> days) {
        this.days = days;
    }

    public void addDay(ScheduleDay day) {
        days.add(day);
    }

    public ScheduleDay getDayByTag(int t) {
        for (ScheduleDay d : days) {
            if (d.getTag() == t) return d;
        }
        return null;
    }

    public Collection<ScheduleDay> getDays() {
        return days;
    }

    @JsonIgnore
    public List<ScheduleDay> getDaysList() {
        return (List<ScheduleDay>)days;
    }

    public void setDays(Collection<ScheduleDay> days) {
        this.days = days;
    }

}
