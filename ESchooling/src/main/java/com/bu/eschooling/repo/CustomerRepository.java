package com.bu.eschooling.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bu.eschooling.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);
}