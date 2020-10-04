package com.posni.goalplanner.goalplanner.data.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userName;
    private long totalGoal;
    private long carbGoal;
    private long proteinGoal;
    private long fatGoa;
}
