package com.ntsoftware.myvspc.newsservice.entities.dao;

import javax.persistence.*;

@Entity
@Table(schema = "vspc_news_database", name = "images")
public class ImagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "image")
    private byte[] image;

    public ImagesEntity() {
    }

    public ImagesEntity(String name, byte[] image) {
        this.name = name;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ImagesEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
