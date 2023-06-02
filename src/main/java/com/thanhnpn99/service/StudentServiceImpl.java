package com.thanhnpn99.service;

import java.util.List;

import com.thanhnpn99.model.Student;
import com.thanhnpn99.repository.StudentRepository;
import com.thanhnpn99.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		System.out.println("Setter Injection ");
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudent(){
		return studentRepository.getAllStudent();
	}

}
