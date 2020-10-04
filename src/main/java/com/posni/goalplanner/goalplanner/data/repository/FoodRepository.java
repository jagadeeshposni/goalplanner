package com.posni.goalplanner.goalplanner.data.repository;

import com.posni.goalplanner.goalplanner.data.dto.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {
}
