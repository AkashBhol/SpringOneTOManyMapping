package com.akash.service;

import java.util.List;

import com.akash.dto.StudentDto;
import com.akash.entity.Student;

public interface IStudentService {
	public Student saveStudent(Student student);

	public List<StudentDto> getStudent();
}
