package com.ntsoftware.myvspc.newsservice.services;


import com.ntsoftware.myvspc.newsservice.entities.dao.NewsEntity;

import java.util.List;

public interface NewsService {
    NewsEntity addNews(NewsEntity entity);

    List<NewsEntity> addAllNews(List<NewsEntity> entities);

    List<NewsEntity> getAllNews();

    List<NewsEntity> getAllNewsSortedByTime();

    void deleteNewsById(long id);
}
