package com.dbdemo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbdemo.demo.dto.ContactDTO;
import com.dbdemo.demo.service.ContactService;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody ContactDTO contactDTO) {
		return new ResponseEntity<ContactDTO>(contactService.save(contactDTO),HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> list() {
		return new ResponseEntity<List<ContactDTO>>(contactService.list(),HttpStatus.OK);
	}
}
