package com.akash.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.dto.ClassDto;
import com.akash.dto.StudentDto;
import com.akash.entity.Student;
import com.akash.repo.StudentRepo;
import com.akash.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentRepo repo;

	@Override
	public Student saveStudent(Student student) {
		Student save = this.repo.save(student);
		return save;
	}

	@Override
	public List<StudentDto> getStudent() {
		
		List<Student> findAll = this.repo.findAll();
		List<StudentDto> studto=new ArrayList<>();
		findAll.forEach(stu->{
			StudentDto studto1=new StudentDto();
			studto1.setId(stu.getId());
			studto1.setAge(stu.getAge());
			studto1.setName(stu.getName());
			studto1.setRollno(stu.getRollno());
			
			ClassDto dto=new ClassDto();
			dto.setId(stu.getCla().getId());
			dto.setName(stu.getCla().getName());
			dto.setCode(stu.getCla().getCode());
			studto1.setCla(dto);
			studto.add(studto1);
		});
		return studto;
	}

}
