package com.akash.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.entity.Class;
import com.akash.repo.ClassRepo;
import com.akash.service.IClassService;

@Service
public class ClassServiceImpl implements IClassService {
	@Autowired
	private ClassRepo repo;

	@Override
	public Class saveClass(Class cla) {
		cla.getStu().forEach(stu->stu.setCla(cla));
		Class save = this.repo.save(cla);
		return save;
	}

	@Override
	public List<Class> getClasses() {
		List<Class> findAll = this.repo.findAll();
		return findAll;
	}
}
