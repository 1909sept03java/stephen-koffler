package com.math.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.math.repository.MathProblemRepository;
import com.sat.math.model.MathProblem;

@Service
public class MathProblemService {
	private MathProblemRepository mathProblemRepository;
	
	@Autowired
	public MathProblemService(MathProblemRepository mathProblemRepository) {
		super();
		this.mathProblemRepository = mathProblemRepository;
	}
	
	public List<MathProblem> getAllMathProblems() {
		return this.mathProblemRepository.findAll();
		}
	
	public void insertNewMathProblem(MathProblem m) {
		this.mathProblemRepository.save(m);
	}
	
	
	

}
