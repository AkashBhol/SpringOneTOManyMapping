package com.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
