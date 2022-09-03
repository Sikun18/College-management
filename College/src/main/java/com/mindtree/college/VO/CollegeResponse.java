package com.mindtree.college.VO;

import java.util.List;

import com.mindtree.college.entity.College;
import com.mindtree.college.entity.Student;

public class CollegeResponse {
	
	private College college; 
	
	private List<Student> students;

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	} 

}
