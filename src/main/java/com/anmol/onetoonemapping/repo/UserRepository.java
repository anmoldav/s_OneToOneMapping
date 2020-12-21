package com.anmol.onetoonemapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anmol.onetoonemapping.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
