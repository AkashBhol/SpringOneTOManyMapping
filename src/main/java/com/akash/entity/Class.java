package com.akash.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "class")
public class Class {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_id")
	private int id;
	private String name;
	private String code;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "cla")
	@JsonManagedReference
	private List<Student> stu;
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
	public List<Student> getStu() {
		return stu;
	}
	public void setStu(List<Student> stu) {
		this.stu = stu;
	}
	public Class(int id, String name, String code, List<Student> stu) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.stu = stu;
	}
	public Class() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", code=" + code + ", stu=" + stu + "]";
	}
	
}
