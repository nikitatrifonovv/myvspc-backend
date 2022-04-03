package com.ntsoftware.myvspc.newsservice.entities.dao;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(schema = "vspc_news_database", name = "image")
public class ImageEntity {

    @Id
    @Setter(AccessLevel.NONE)
    @Column(name = "image_id", columnDefinition = "VARCHAR(36)")
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "image_name")
    private String name;

    @Lob
    @Column(name = "image_binary")
    private byte[] image;

}
