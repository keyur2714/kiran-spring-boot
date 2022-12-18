package com.dbdemo.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbdemo.demo.dto.StudentDTO;
import com.dbdemo.demo.mapper.StudentMapper;
import com.dbdemo.demo.repository.StudentRepository;
import com.dbdemo.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public StudentDTO save(StudentDTO studentDTO) {
		return studentMapper.toDto(studentRepository.save(studentMapper.toEntity(studentDTO)));
	}

	@Override
	public List<StudentDTO> list() {
		return studentRepository.findAll().stream().map(studentMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public StudentDTO get(Long studentId) {
		return studentMapper.toDto(studentRepository.findById(studentId).get());
	}

	@Override
	public void delete(Long studentId) {
		studentRepository.deleteById(studentId);
	}

	@Override
	public StudentDTO update(StudentDTO studentDTO) {
		return studentMapper.toDto(studentRepository.save(studentMapper.toEntity(studentDTO)));
	}

}
