package com.ntsoftware.myvspc.scheduleservice.entities.dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "vspc_schedule_db", name = "call_schedule")
public class CallsEntity {

    @Id
    @Column(name = "lesson_number")
    private int lesson_number;

    @Column(name = "start")
    private String start;

    @Column(name = "end")
    private String end;

    @Column(name = "break")
    private String _break;

    public CallsEntity() {
    }

    public CallsEntity(int lesson_number, String start, String end, String _break) {
        this.lesson_number = lesson_number;
        this.start = start;
        this.end = end;
        this._break = _break;
    }

    public int getLesson_number() {
        return lesson_number;
    }

    public void setLesson_number(int lesson_number) {
        this.lesson_number = lesson_number;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String get_break() {
        return _break;
    }

    public void set_break(String _break) {
        this._break = _break;
    }

    @Override
    public String toString() {
        return "CallsEntity{" +
                "lesson_number=" + lesson_number +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", _break='" + _break + '\'' +
                '}';
    }
}
