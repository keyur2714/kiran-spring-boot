package com.demoapp.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demoapp.demo.dto.Student;

@RestController
@RequestMapping("/api")
public class WelcomeController {

	@GetMapping("/sayHello/{message}/{id}")
	public String sayHello(@PathVariable String message, @PathVariable Long id) {
		return message + "_" + id;
	}

	@GetMapping("/message")
	public String meassage(@RequestParam("name") String name, @RequestParam("city") String city) {
		return "Good Afternoon...!" + name + "_" + city;
	}

	@GetMapping("/listStudents")
	public List<Student> listStudents() {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setRollNo(11l);
		student1.setName("Keyur");
		Student student2 = new Student();
		student2.setRollNo(12l);
		student2.setName("Kiran");

		studentList.add(student1);
		studentList.add(student2);
		return studentList;
	}
}
