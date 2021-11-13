package com.ntsoftware.myvspc.scheduleservice.repositories;

import com.ntsoftware.myvspc.scheduleservice.entities.dao.LessonTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonTypeRepository extends JpaRepository<LessonTypeEntity,Integer> {
}
