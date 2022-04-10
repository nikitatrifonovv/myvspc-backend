package com.ntsoftware.myvspc.newsservice.repositories;

import com.ntsoftware.myvspc.newsservice.entities.dao.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NewsRepo extends JpaRepository<NewsEntity, UUID> {

}
