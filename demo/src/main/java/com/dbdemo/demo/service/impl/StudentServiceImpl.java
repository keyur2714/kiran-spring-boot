package com.dbdemo.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbdemo.demo.dto.StudentDTO;
import com.dbdemo.demo.entity.Student;
import com.dbdemo.demo.repository.StudentRepository;
import com.dbdemo.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public StudentDTO save(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName(studentDTO.getName());
		Student newStudent = studentRepository.save(student);
		StudentDTO studentDTO2=new StudentDTO();
		studentDTO2.setId(newStudent.getId());
		studentDTO2.setName(newStudent.getName());
		return studentDTO2;
	}

}
