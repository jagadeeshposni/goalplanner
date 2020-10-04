package com.posni.goalplanner.goalplanner.data.repository;

import com.posni.goalplanner.goalplanner.data.dto.Goal;
import org.springframework.data.repository.CrudRepository;

public interface GoalRepository extends CrudRepository<Goal, Long> {

}
