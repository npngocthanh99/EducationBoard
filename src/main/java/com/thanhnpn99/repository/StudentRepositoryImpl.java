package com.thanhnpn99.repository;

import java.util.ArrayList;
import java.util.List;

import com.thanhnpn99.model.Student;

public class StudentRepositoryImpl implements StudentRepository{
	public List<Student> getAllStudent(){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Thanh", "Ha Noi"));
		return studentList;
	}
}
