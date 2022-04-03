package com.ntsoftware.myvspc.newsservice.repositories;

import com.ntsoftware.myvspc.newsservice.entities.dao.NewsTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsTypeRepo extends JpaRepository<NewsTypeEntity, Long> {

}
