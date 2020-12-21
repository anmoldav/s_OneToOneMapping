package com.anmol.onetoonemapping.service;

import java.util.List;
import java.util.Optional;

import javax.xml.ws.soap.Addressing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anmol.onetoonemapping.dto.Address;
import com.anmol.onetoonemapping.dto.User;
import com.anmol.onetoonemapping.repo.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepository addressRepository;

	@Override
	public List<Address> getAllAddresses() {
		return addressRepository.findAll();
	}

	@Override
	public Address UpdateUser(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address getAddressById(int id) {
		Optional<Address> optionalAddress = addressRepository.findById(id);
		if (optionalAddress.isPresent()) {
			optionalAddress.get();
		}
		return null;
	}

	@Override
	public void deleteAddress(int id) {
		addressRepository.deleteById(id);
	}

	@Override
	public Address careateAddress(Address address) {
		User user = new User();
		user.setName(address.getUser().getName());

		address.setUser(user);
		return addressRepository.save(address);
	}

}
