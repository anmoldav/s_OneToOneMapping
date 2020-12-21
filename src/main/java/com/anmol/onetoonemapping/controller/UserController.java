package com.anmol.onetoonemapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anmol.onetoonemapping.dto.User;
import com.anmol.onetoonemapping.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping
	@RequestMapping("/add")
	public ResponseEntity<User> createUser(@RequestBody User user){
	User user1=userService.createUser(user);
	return new  ResponseEntity<User>(user1,HttpStatus.CREATED);
	}
	

}
