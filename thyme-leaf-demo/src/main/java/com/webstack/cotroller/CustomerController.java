package com.webstack.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webstack.service.CostomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CostomerService costomerService;

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("customer",costomerService.get());
		return "customer/customer-list";
	}
	
}
