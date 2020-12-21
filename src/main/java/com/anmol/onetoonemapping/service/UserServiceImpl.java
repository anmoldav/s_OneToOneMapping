package com.anmol.onetoonemapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anmol.onetoonemapping.dto.Address;
import com.anmol.onetoonemapping.dto.User;
import com.anmol.onetoonemapping.repo.AddressRepository;
import com.anmol.onetoonemapping.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	AddressRepository addressRepository;

	@Override
	public User createUser(User user) {
      Address add= new Address();
      add.setAddressLineOne(user.getAddress().getAddressLineOne());
      add.setAddressLineTwo(user.getAddress().getAddressLineTwo());
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User UpdateUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User getUserById(int id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent()) {

			optionalUser.get();
		} else
			throw new IllegalArgumentException("Id must not be null");
		return null;
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
