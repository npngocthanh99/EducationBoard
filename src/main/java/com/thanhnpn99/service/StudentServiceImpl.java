package com.thanhnpn99.service;

import java.util.List;

import com.thanhnpn99.model.Student;
import com.thanhnpn99.repository.StudentRepository;
import com.thanhnpn99.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository = new StudentRepositoryImpl();
	
	public List<Student> getAllStudent(){
		return studentRepository.getAllStudent();
	}

}
