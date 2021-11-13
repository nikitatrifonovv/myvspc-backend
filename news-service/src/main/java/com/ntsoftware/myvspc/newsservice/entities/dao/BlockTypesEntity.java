package com.ntsoftware.myvspc.newsservice.entities.dao;

import javax.persistence.*;

@Entity
@Table(schema = "vspc_news_database", name = "block_types")
public class BlockTypesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    public BlockTypesEntity() {
    }

    public BlockTypesEntity(String name) {
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
        return "BlockTypesEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
