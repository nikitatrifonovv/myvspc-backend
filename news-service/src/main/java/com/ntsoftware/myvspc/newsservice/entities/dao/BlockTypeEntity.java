package com.ntsoftware.myvspc.newsservice.entities.dao;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "vspc_news_database", name = "block_type")
public class BlockTypeEntity {

    @Id
    @Setter(AccessLevel.NONE)
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type_name")
    private String name;

}
