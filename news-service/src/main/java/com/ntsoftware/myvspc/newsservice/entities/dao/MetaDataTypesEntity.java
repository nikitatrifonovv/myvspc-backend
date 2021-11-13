package com.ntsoftware.myvspc.newsservice.entities.dao;

import javax.persistence.*;

@Entity
@Table(schema = "vspc_news_database", name = "meta_data_types")
public class MetaDataTypesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    public MetaDataTypesEntity() {
    }

    public MetaDataTypesEntity(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MetaDataTypes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
