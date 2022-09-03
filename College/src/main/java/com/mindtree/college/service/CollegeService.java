package com.mindtree.college.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.college.entity.College;



@Service
public interface CollegeService {

	College add(College collg);

	List<College> list();
	College update(long id, String name);
	College serachById(long id);
	

}
