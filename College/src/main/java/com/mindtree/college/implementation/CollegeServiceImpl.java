package com.mindtree.college.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mindtree.college.VO.CollegeResponse;
import com.mindtree.college.entity.College;
import com.mindtree.college.entity.Student;
import com.mindtree.college.repository.CollegeRepository;
import com.mindtree.college.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService{
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CollegeRepository collegeRepository;
	

	public List<CollegeResponse> listWithcllg() {
		List<CollegeResponse> fullList = new ArrayList<CollegeResponse>();
		List<College> allclg = collegeRepository.findAll();
		Iterator<College> ir = allclg.iterator();
		while(ir.hasNext())
		{
			College dpt = ir.next();
			ResponseEntity<Student[]> response =
					  restTemplate.getForEntity(
							  "http://STUDENT-SERVICE/student/Student-with-ascname/"+dpt.getCollege_id(),
							  Student[].class);
			Student[] students = response.getBody();
			List<Student> studentsList = Arrays.asList(students);
			CollegeResponse clgres = new CollegeResponse();
			clgres.setCollege(dpt);
			clgres.setStudents(studentsList);
			fullList.add(clgres);
		}
		return fullList;
	}


	@Override
	public College add(College collg) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<College> list() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public College update(long id, String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public College serachById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
