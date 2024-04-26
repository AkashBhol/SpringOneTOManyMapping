package com.akash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.entity.Class;
import com.akash.service.IClassService;

@RestController
@RequestMapping("/api")
public class ClassController {

	@Autowired
	private IClassService service;
	
	@PostMapping("/post")
	public ResponseEntity<Class> saveClass(@RequestBody Class cla){
		Class saveClass = this.service.saveClass(cla);
		return new ResponseEntity<Class>(saveClass,HttpStatus.CREATED);
	}
	@GetMapping("/get")
	public ResponseEntity<List<Class>> getAllRecords(@RequestBody Class cla){
	List<Class> classes = this.service.getClasses();
		return new ResponseEntity<List<Class>>(classes,HttpStatus.OK);
	}
}
