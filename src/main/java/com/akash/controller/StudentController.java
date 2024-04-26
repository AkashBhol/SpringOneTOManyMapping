package com.akash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.dto.StudentDto;
import com.akash.entity.Student;
import com.akash.service.IStudentService;

@RestController
@RequestMapping("/api/v2")
public class StudentController {
	@Autowired
	private IStudentService service;

	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student saveStudent = this.service.saveStudent(student);
		return new ResponseEntity<Student>(saveStudent, HttpStatus.CREATED);
	}
	@GetMapping("/gets")
	public ResponseEntity<List<StudentDto>> getAllreords(){
		List<StudentDto> student = this.service.getStudent();
		return new ResponseEntity<List<StudentDto>>(student,HttpStatus.OK);
	}
}
