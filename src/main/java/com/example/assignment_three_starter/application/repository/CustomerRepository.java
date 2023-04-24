package com.example.assignment_three_starter.application.repository;

import com.example.assignment_three_starter.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Query
    List<Customer> getAllByCountry(String country);

}