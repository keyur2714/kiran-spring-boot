package com.dbdemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbdemo.demo.dto.StudentDTO;
import com.dbdemo.demo.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public StudentDTO save(@RequestBody StudentDTO studentDTO) {		
		return studentService.save(studentDTO);
	}

}
