package com.revature.week6.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.week6.model.Student;
import com.revature.week6.service.StudentService;

@CrossOrigin
@RestController
@RequestMapping (value = "/student")
public class StudentController {
	

	private StudentService studentService;
	
	public StudentController(StudentService studentService) {
		
		this.studentService = studentService;
	}
	
	/**
	 * @RequestMapping maps the url pattern to the CRUD method that you
	 * implmented in the StudentService
	 * 
	 * ResponseEntity is return type. must be some
	 * kind of object.
	 * getAll() is the method we're mapping to the url pattern.
	 * the return type in the method definition calls the getAllStudents
	 * @return
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(this.studentService.getAllStudents(), HttpStatus.OK);
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) // parameterize the path
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student f = this.studentService.getStudentbyId(id);
        if (f == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(f, HttpStatus.OK);
        }
    }
	 @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public ResponseEntity<String> addStudent(@Valid @RequestBody Student student) {
	        ResponseEntity<String> resp = null;
	        try {
	            this.studentService.insertNewStudent(student);
	            resp = new ResponseEntity<>("STUDENT CREATED SUCCESSFULLY", HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            resp = new ResponseEntity<>("FAILED TO CREATE STUDENT", HttpStatus.BAD_REQUEST);
	        }
	        return resp;
	    }
	 @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
	        ResponseEntity<String> resp = null;
	        try {
	            this.studentService.deleteStudent(id);
	            resp = new ResponseEntity<>("STUDENT DELETED SUCCESSFULLY", HttpStatus.OK);
	        } catch (Exception e) {
	            e.printStackTrace();
	            resp = new ResponseEntity<>("FAILED TO DELETE STUDENT", HttpStatus.BAD_REQUEST);
	        }
	        
	        return resp;
	        
	    }
	    
	    
	        
	    
	
}
