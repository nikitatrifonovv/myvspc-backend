package com.ntsoftware.myvspc.newsservice.services;

import com.ntsoftware.myvspc.newsservice.entities.dao.ImagesEntity;

public interface ImageService {
    void add(ImagesEntity image);

    void deleteById(long id);

    void deleteByName(String name);
}
