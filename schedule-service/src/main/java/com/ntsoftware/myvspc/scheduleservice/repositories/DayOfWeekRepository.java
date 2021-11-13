package com.ntsoftware.myvspc.scheduleservice.repositories;

import com.ntsoftware.myvspc.scheduleservice.entities.dao.DayOfWeekEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayOfWeekRepository extends JpaRepository<DayOfWeekEntity,Integer> {
}
