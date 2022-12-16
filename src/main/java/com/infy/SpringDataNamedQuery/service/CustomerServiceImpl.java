package com.infy.SpringDataNamedQuery.service;


import com.infy.SpringDataNamedQuery.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public String findNameByEmailId(String emailId){
        return customerRepository.findNameByEmailId(emailId);
    }
}
