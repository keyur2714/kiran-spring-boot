package com.dbdemo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<StudentDTO> save(@RequestBody StudentDTO studentDTO) {
		return new ResponseEntity<StudentDTO>(studentService.save(studentDTO), HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody StudentDTO studentDTO) {
		if (studentDTO.getStudentId() == null) {
			new ResponseEntity<String>("Id Must be present for Update", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<StudentDTO>(studentService.save(studentDTO), HttpStatus.OK);
	}

	@GetMapping("/list")
	public ResponseEntity<List<?>> list(){		
		return new ResponseEntity<List<?>>(studentService.list(),HttpStatus.OK) ;
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<StudentDTO> get(@PathVariable Long id) {
		return new ResponseEntity<StudentDTO>(studentService.get(id), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<?> delete(@PathVariable Long studentId) {
		 studentService.delete(studentId);
		 return new ResponseEntity<String>("Stduunt Delete Successfully",HttpStatus.OK);
	}

}
