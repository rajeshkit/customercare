package com.cms.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.model.Customer;

@RestController
public class CustomerController {
	
	static List<Customer> list=Arrays.asList(new Customer(100, "Rajesh", "Chennai", "654456", "dff", 56878L),
			new Customer(101, "Vijay", "Mumbai", "7877877", "dgsfgg", 23444L),
			new Customer(102, "Arun", "Bangalore", "6767677", "ghghjjh", 78788L),
			new Customer(103, "Mahesh", "Pune", "454545", "adssd", 65656L));
	@PostMapping("/customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		list.add(customer);
		ResponseEntity<Customer> re=new ResponseEntity<>(customer,HttpStatus.CREATED);
		return re; 
	}
	@GetMapping("/hello")
	public String welcome() {
		return "Hello Welcome";
	}
	@GetMapping("/customers")
	public List<Customer> getCustomer(){ 
		return list;
	}
	@GetMapping("/customer/{custId}")
	public Customer getCustomerById(@PathVariable("custId") int cId){
		Optional<Customer> cust = list.stream().filter((c)->c.getCustomerId()==cId).findAny();
		return cust.get();
	}
	
	
	
}
