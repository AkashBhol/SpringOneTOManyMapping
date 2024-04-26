package com.akash.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(value = Include.NON_NULL)
public class StudentDto {
	private int id;
	private String name;
	private String rollno;
	private String age;
	private ClassDto cla;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public ClassDto getCla() {
		return cla;
	}
	public void setCla(ClassDto cla) {
		this.cla = cla;
	}
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	public StudentDto(int id, String name, String rollno, String age, ClassDto cla) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.cla = cla;
	}
	
}
