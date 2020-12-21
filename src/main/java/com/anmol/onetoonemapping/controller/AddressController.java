package com.anmol.onetoonemapping.controller;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anmol.onetoonemapping.dto.Address;
import com.anmol.onetoonemapping.repo.AddressRepository;
import com.anmol.onetoonemapping.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressService addressService;
	@Autowired
	AddressRepository addressRepository;

	@PostMapping
	@RequestMapping("/add")
	public ResponseEntity<Address> createAddress(@RequestBody Address address) {
		Address add = addressService.careateAddress(address);
		return new ResponseEntity<Address>(add, HttpStatus.CREATED);
	}

	@GetMapping(path = "/get/{id}")

	public ResponseEntity<Address> getAddress(@PathVariable(value = "id") int id) {
		return new ResponseEntity<>(addressService.getAddressById(id), HttpStatus.OK);
	}
	
	

}
