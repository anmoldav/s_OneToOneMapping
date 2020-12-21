package com.anmol.onetoonemapping.service;

import java.util.List;

import com.anmol.onetoonemapping.dto.User;

public interface UserService {
	
	public User createUser(User user);
	
	public List<User> getAllUsers();
	public User UpdateUser(User user);
	public User getUserById(int id);
	public void deleteUser(int id);

}
