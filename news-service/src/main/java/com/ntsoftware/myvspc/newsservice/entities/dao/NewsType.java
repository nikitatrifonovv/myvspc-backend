package com.ntsoftware.myvspc.newsservice.entities.dao;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "vspc_news_database", name = "news_type")
public class NewsType {

    @Id
    @Setter(AccessLevel.NONE)
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type_name")
    private String name;

}
