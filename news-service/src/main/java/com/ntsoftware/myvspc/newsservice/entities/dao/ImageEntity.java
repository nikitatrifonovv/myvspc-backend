package com.ntsoftware.myvspc.newsservice.entities.dao;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(schema = "vspc_news_database", name = "image")
public class ImageEntity {

    @Id
    @Setter(AccessLevel.NONE)
    @Column(name = "image_id", columnDefinition = "VARCHAR(36)")
    @Type(type="uuid-char")
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "image_name")
    private String name;

    @Lob
    @Column(name = "image_binary")
    private byte[] image;

}
