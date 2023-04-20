package com.thanhnpn99;

import java.util.List;

import com.thanhnpn99.model.Student;
import com.thanhnpn99.service.StudentService;
import com.thanhnpn99.service.StudentServiceImpl;

public class EducationApp {

	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		List<Student> studentList = studentService.getAllStudent();
		System.out.println(studentList.size());
		Student student = studentList.get(0);
		System.out.println(student);
	}

}
