package com.anmol.onetoonemapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anmol.onetoonemapping.dto.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
