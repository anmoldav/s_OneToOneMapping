package com.anmol.onetoonemapping.service;

import java.util.List;

import com.anmol.onetoonemapping.dto.Address;
import com.anmol.onetoonemapping.dto.User;

public interface AddressService {
	
	
public Address careateAddress(Address address);
	
	public List<Address> getAllAddresses();
	public Address UpdateUser(Address address);
	public Address getAddressById(int id);
	public void deleteAddress(int id);

}
