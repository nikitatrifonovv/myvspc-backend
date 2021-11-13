package com.ntsoftware.myvspc.newsservice.responses;

import com.ntsoftware.myvspc.newsservice.entities.SimpleNews;
import com.ntsoftware.myvspc.newsservice.responses.interfaces.NewsResponse;

import java.util.Arrays;
import java.util.List;

public class SimpleNewsResponse implements NewsResponse {

    List<SimpleNews> newsList;

    public SimpleNewsResponse() {
    }

    public List<SimpleNews> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<SimpleNews> newsList) {
        this.newsList = newsList;
    }

    @Override
    public String toString() {
        return "SimpleNewsResponse{" +
                "newsList=" + Arrays.toString(newsList.toArray()) +
                '}';
    }
}
