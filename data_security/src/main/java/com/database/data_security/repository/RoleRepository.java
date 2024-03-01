package com.database.data_security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.data_security.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(String name);
}
