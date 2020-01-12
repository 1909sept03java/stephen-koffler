package com.math.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.math.service.MathProblemService;
import com.sat.math.model.MathProblem;
@CrossOrigin
@RestController
@RequestMapping (value = "/mathproblem")
public class MathProblemController {
	private MathProblemService mathProblemService;
	
	public MathProblemController(MathProblemService mathProblemService) {
		this.mathProblemService = mathProblemService;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<MathProblem>> getAll() {
        return new ResponseEntity<>(this.mathProblemService.getAllMathProblems(), HttpStatus.OK);
	}
	
	

}
