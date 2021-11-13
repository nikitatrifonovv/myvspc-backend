package com.ntsoftware.myvspc.newsservice.repositories;

import com.ntsoftware.myvspc.newsservice.entities.dao.BlocksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocksRepository extends JpaRepository<BlocksEntity, Long> {
    List<BlocksEntity> findAllByNewsOrderByPosition(long id);
    void deleteAllByNews(long id);
}
