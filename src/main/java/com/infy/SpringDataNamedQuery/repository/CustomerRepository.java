package com.infy.SpringDataNamedQuery.repository;

import com.infy.SpringDataNamedQuery.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    String findNameByEmailId(@Param("emailId") String emailId);
}
