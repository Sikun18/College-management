package com.mindtree.college.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long college_id;

	private String name;
	
	private Long totalStudents;

	public Long getCollege_id() {
		return college_id;
	}

	public void setCollege_id(Long college_id) {
		this.college_id = college_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(Long totalStudents) {
		this.totalStudents = totalStudents;
	}
}
