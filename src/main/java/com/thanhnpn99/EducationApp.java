package com.thanhnpn99;

import com.thanhnpn99.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EducationApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentService service = context.getBean("studentService", StudentService.class);
		System.out.println(service.getAllStudent());
	}

}
