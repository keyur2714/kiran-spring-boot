package com.webstack.webdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.webdemo.dto.CustomerDTO;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	List<CustomerDTO> customers = new ArrayList<>();

	@GetMapping("/list")
	public List<CustomerDTO> list() {

		return customers;
	}

	@PostMapping("/save")
	public CustomerDTO save(@RequestBody CustomerDTO customerDTO) {
		customers.add(customerDTO);
		return customerDTO;
	}
}
