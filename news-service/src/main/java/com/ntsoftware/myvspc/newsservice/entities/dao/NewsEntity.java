package com.ntsoftware.myvspc.newsservice.entities.dao;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@Table(schema = "vspc_news_database", name = "news")
public class NewsEntity {
    @Id
    @Setter(AccessLevel.NONE)
    @Column(name = "news_id", columnDefinition = "VARCHAR(36)")
    @Type(type="uuid-char")
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(name = "news_title", columnDefinition = "TEXT")
    private String title;

    @Column(name = "news_sub_title", columnDefinition = "TEXT")
    private String subTitle;

    @CreationTimestamp
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_created_at",insertable = false, updatable = false, nullable = false)
    private Timestamp createdAt;

    @Column(name = "news_creator")
    private String creator;

    @Type(type="uuid-char")
    @Column(name = "news_image_preview_id",columnDefinition = "VARCHAR(36)")
    private UUID imagePreviewId;

    @Column(name = "type")
    private long type;

}
