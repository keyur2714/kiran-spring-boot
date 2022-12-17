package com.dbdemo.demo.service;

import java.util.List;

import com.dbdemo.demo.dto.StudentDTO;

public interface StudentService {
	public StudentDTO save(StudentDTO studentDTO);
	public List<StudentDTO> list();
	public StudentDTO get(Long studentId);
	public void delete(Long studentId);
	public StudentDTO update(StudentDTO studentDTO);
}
