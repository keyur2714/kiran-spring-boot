package com.webstack.service.impl;

import org.springframework.stereotype.Service;

import com.webstack.dto.CustomerDTO;
import com.webstack.service.CostomerService;

@Service
public class CustomerServiceImpl implements CostomerService {

	@Override
	public CustomerDTO get() {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setId(1l);
		customerDTO.setName("Keyur");
		customerDTO.setCity("Pune");
		customerDTO.setMobileNo("7398029671");
		return customerDTO;
	}

	
	
}
