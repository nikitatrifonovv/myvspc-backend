package com.ntsoftware.myvspc.newsservice.entities.dao;

import javax.persistence.*;

@Entity
@Table(schema = "vspc_news_database", name = "news")
public class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title", columnDefinition = "TEXT")
    private String title;

    @Column(name = "sub_title", columnDefinition = "TEXT")
    private String sub_title;

    @Column(name = "meta_data")
    private long meta_data;

    @Column(name = "image",columnDefinition = "TEXT")
    private String image;

    public NewsEntity(String title, String sub_title, long meta_data, String image) {
        this.title = title;
        this.sub_title = sub_title;
        this.meta_data = meta_data;
        this.image = image;
    }

    public NewsEntity(String title, String sub_title, long meta_data) {
        this.title = title;
        this.sub_title = sub_title;
        this.meta_data = meta_data;
    }

    public NewsEntity() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public long getMeta_data() {
        return meta_data;
    }

    public void setMeta_data(long meta_data) {
        this.meta_data = meta_data;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "NewsEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sub_title='" + sub_title + '\'' +
                ", meta_data=" + meta_data +
                '}';
    }
}
