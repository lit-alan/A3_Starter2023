package com.example.assignment_three_starter.application.service;

import com.example.assignment_three_starter.application.repository.CustomerRepository;
import com.example.assignment_three_starter.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    public List<Customer> findAll() {
        return (List<Customer>) customerRepo.findAll();
    }

    public Optional<Customer> findById(Integer id){
        return customerRepo.findById(id);
    }

    public List<Customer> getAllByCountry(String country) {
        return customerRepo.getAllByCountry(country);
    }

    public Customer save(Customer customer){
        return customerRepo.save(customer);
    }

    public void delete(Customer customer){
        customerRepo.delete(customer);
    }

    public void delete(Integer id){
        customerRepo.deleteById(id);
    }
}