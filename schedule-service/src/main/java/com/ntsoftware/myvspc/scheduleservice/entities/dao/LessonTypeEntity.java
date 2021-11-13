package com.ntsoftware.myvspc.scheduleservice.entities.dao;

import javax.persistence.*;

@Entity
@Table(schema = "vspc_schedule_db", name = "lesson_type")
public class LessonTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public LessonTypeEntity() {
    }

    public LessonTypeEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public LessonTypeEntity(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LessonTypeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
