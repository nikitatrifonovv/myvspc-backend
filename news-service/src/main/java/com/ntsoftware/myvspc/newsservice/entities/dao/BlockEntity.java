package com.ntsoftware.myvspc.newsservice.entities.dao;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(schema = "vspc_news_database", name = "blocks")
public class BlockEntity {

    @Id
    @Setter(AccessLevel.NONE)
    @Column(name = "block_id", columnDefinition = "VARCHAR(36)")
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "news_id")
    private UUID newsId;

    @Column(name = "block_type")
    private long type;

    @Column(name = "block_position")
    private int position;

    @Column(name = "block_data",columnDefinition = "LONGTEXT")
    private String data;

}
