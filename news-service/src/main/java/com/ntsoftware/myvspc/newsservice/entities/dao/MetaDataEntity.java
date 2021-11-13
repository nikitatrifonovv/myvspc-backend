package com.ntsoftware.myvspc.newsservice.entities.dao;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(schema = "vspc_news_database", name = "meta_data")
public class MetaDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "date", insertable = false, updatable = false)
    private Timestamp date;

    @Column(name = "creator")
    private String creator;

    @Column(name = "type")
    private long type;

    public long getId() {
        return id;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getCreator() {
        return creator;
    }

    public long getType() {
        return type;
    }

    public MetaDataEntity(String creator, long type) {
        this.creator = creator;
        this.type = type;
    }

    public MetaDataEntity(Timestamp date, String creator, long type) {
        this.date = date;
        this.creator = creator;
        this.type = type;
    }

    public MetaDataEntity() {
    }

    @Override
    public String toString() {
        return "MetaDataEntity{" +
                "id=" + id +
                ", date=" + date +
                ", creator='" + creator + '\'' +
                ", type=" + type +
                '}';
    }
}
