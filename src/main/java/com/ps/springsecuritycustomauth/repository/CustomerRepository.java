package com.ps.springsecuritycustomauth.repository;

import org.springframework.data.repository.CrudRepository;

import com.ps.springsecuritycustomauth.model.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByEmail(String email);

}
