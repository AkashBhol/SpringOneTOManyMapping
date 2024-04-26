package com.akash.service;

import java.util.List;

import com.akash.entity.Class;

public interface IClassService {
	public Class saveClass(Class cla);

	public List<Class> getClasses();
}
