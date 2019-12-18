package com.math.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sat.math.model.MathProblem;

@Repository
public interface MathProblemRepository extends JpaRepository<MathProblem, Integer> {

}
