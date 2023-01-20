package com.rexa.employeedatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rexa.employeedatabase.entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	public boolean existsByFirstNameAndLastName(String firstName, String lastName);
	public boolean existsById(int id);
}
