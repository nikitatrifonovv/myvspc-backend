package com.ntsoftware.myvspc.scheduleservice.repositories;

import com.ntsoftware.myvspc.scheduleservice.entities.dao.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity,Integer> {
}
