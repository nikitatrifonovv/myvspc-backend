package com.ntsoftware.myvspc.newsservice.entities;

import java.sql.Timestamp;

public class SimpleNews {
    private long id;
    private String title;
    private String sub_title;
    private Timestamp date;
    private String creator;
    private long type;
    private String type_name;
    private String image;

    private String image_id;

    public SimpleNews() {
    }

    public SimpleNews(long id, String title, String sub_title, Timestamp date, String creator, long type, String type_name, String image) {
        this.id = id;
        this.title = title;
        this.sub_title = sub_title;
        this.date = date;
        this.creator = creator;
        this.type = type;
        this.type_name = type_name;
        this.image = image;
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

    public Timestamp getDate() {
        return date;
    }

    public String getCreator() {
        return creator;
    }

    public long getType() {
        return type;
    }

    public String getType_name() {
        return type_name;
    }

    public String getImage() {
        return image;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

//    @Override
//    public int compareTo(SimpleNews o) {
//        return getDate().co;
//    }

    public static class Builder {

        private final SimpleNews simpleNews;

        public Builder(){
            simpleNews = new SimpleNews();
        }

        public Builder id(long id) {
            simpleNews.id = id;
            return this;
        }

        public Builder title(String title) {
            simpleNews.title = title;
            return this;
        }

        public Builder subTitle(String sub_title) {
            simpleNews.sub_title = sub_title;
            return this;
        }

        public Builder creator(String creator) {
            simpleNews.creator = creator;
            return this;
        }

        public Builder type(long type) {
            simpleNews.type = type;
            return this;
        }

        public Builder typeName(String type_name) {
            simpleNews.type_name = type_name;
            return this;
        }

        public Builder image(String image) {
            simpleNews.image = image;
            return this;
        }

        public Builder date(Timestamp date) {
            simpleNews.date = date;
            return this;
        }

        public SimpleNews build(){
            return simpleNews;
        }

    }
}
