package com.ntsoftware.myvspc.scheduleservice.entities.dao;

import javax.persistence.*;

@Entity
@Table(schema = "vspc_schedule_db", name = "lesson")
public class LessonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name", columnDefinition = "TEXT")
    private String name;

    @Column(name = "type")
    private int type;

    @Column(name = "teacher", columnDefinition = "TEXT")
    private String teacher;

    @Column(name = "audience")
    private String audience;

    @Column(name = "group_id")
    private int group;

    @Column(name = "day_of_week")
    private int dayofweek;

    @Column(name = "number")
    private int number;

    @Column(name = "semester")
    private int semester;

    @Column(name = "subgroup")
    private int subgroup;

    public LessonEntity() {
    }

    public LessonEntity(long id, String name, int type, String teacher, String audience, int group, int dayofweek, int number, int semester, int subgroup) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.teacher = teacher;
        this.audience = audience;
        this.group = group;
        this.dayofweek = dayofweek;
        this.number = number;
        this.semester = semester;
        this.subgroup = subgroup;
    }

    public LessonEntity(String name, int type, String teacher, String audience, int group, int dayofweek, int number, int semester, int subgroup) {
        this.name = name;
        this.type = type;
        this.teacher = teacher;
        this.audience = audience;
        this.group = group;
        this.dayofweek = dayofweek;
        this.number = number;
        this.semester = semester;
        this.subgroup = subgroup;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getDayofweek() {
        return dayofweek;
    }

    public void setDayofweek(int dayofweek) {
        this.dayofweek = dayofweek;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(int subgroup) {
        this.subgroup = subgroup;
    }

    @Override
    public String toString() {
        return "LessonEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", teacher='" + teacher + '\'' +
                ", audience='" + audience + '\'' +
                ", group=" + group +
                ", day_of_week=" + dayofweek +
                ", number=" + number +
                ", semester=" + semester +
                ", subgroup=" + subgroup +
                '}';
    }
}
