package com.ntsoftware.myvspc.newsservice.entities.dao;

import javax.persistence.*;

@Entity
@Table(schema = "vspc_news_database", name = "blocks")
public class BlocksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "news")
    private long news;

    @Column(name = "type")
    private long type;

    @Column(name = "position")
    private int position;

    @Column(name = "data",columnDefinition = "LONGTEXT")
    private String data;

    public BlocksEntity() {
    }

    public BlocksEntity(long news, long type, int position, String data) {
        this.news = news;
        this.type = type;
        this.position = position;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public long getNews() {
        return news;
    }

    public long getType() {
        return type;
    }

    public int getPosition() {
        return position;
    }

    public String getData() {
        return data;
    }

    public void setNews(long news) {
        this.news = news;
    }

    public void setType(long type) {
        this.type = type;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BlocksEntity{" +
                "id=" + id +
                ", news=" + news +
                ", type=" + type +
                ", position=" + position +
                ", data=" + data +
                '}';
    }
}
