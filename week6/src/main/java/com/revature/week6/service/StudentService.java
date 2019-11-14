package com.revature.week6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.week6.model.Student;
import com.revature.week6.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;
	
@Autowired
public StudentService(StudentRepository studentRepository) {
	this.studentRepository = studentRepository;
}

public List<Student>getAllStudents() {
	return this.studentRepository.findAll();
	}

public Student getStudentbyId(int id) {
	return this.studentRepository.findById(id).orElse(null);
	
}

public void insertNewStudent(Student s) {
	this.studentRepository.save(s);
}
	
public void deleteStudent(int id) {
	this.studentRepository.deleteById(id);
	
}
}
