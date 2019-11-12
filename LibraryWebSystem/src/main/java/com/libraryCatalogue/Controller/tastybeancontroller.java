package com.libraryCatalogue.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.libraryCatalogue.Model.Bean.tastybean;
import com.libraryCatalogue.Service.tastybeanservice;



@Controller
@RequestMapping(value="/bean")
public class tastybeancontroller {
	private tastybeanservice tt;
	@Autowired // setter injection
	public void settastybeanservice(tastybeanservice ts) {
		this.tt = ts;
	}
	@ResponseBody // tells Spring to skip ViewResolver
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<tastybean>> getAll() {
		return new ResponseEntity<>(this.tt.allBeans(), HttpStatus.OK);
	}
	/*
	@ResponseBody // tells Spring to skip ViewResolver
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> addFlashcard(@RequestBody tastybean tb){
		ResponseEntity<String> resp = null;
		try {
			this.tt.addBean(tb);
			resp = new ResponseEntity<>("Done",HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp = new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
		}		
		return resp;
		
	}
	*/
	
}
