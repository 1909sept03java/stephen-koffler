package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  {
    
}