package com.ntsoftware.myvspc.scheduleservice.entities.dao;

import javax.persistence.*;

@Entity
@Table(schema = "vspc_schedule_db", name = "day_of_week")
public class DayOfWeekEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public DayOfWeekEntity() {
    }

    public DayOfWeekEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public DayOfWeekEntity(String name) {
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
        return "DayOfWeekEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
