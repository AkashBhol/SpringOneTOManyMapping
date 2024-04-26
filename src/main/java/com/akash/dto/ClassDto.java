package com.akash.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(value = Include.NON_NULL)
public class ClassDto {
	private int id;
	private String name;
	private String code;
	private List<StudentDto> stu;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<StudentDto> getStu() {
		return stu;
	}
	public void setStu(List<StudentDto> stu) {
		this.stu = stu;
	}
	public ClassDto(int id, String name, String code, List<StudentDto> stu) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.stu = stu;
	}
	public ClassDto() {
		// TODO Auto-generated constructor stub
	}
}
