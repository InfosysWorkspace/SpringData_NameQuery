package com.infy.SpringDataNamedQuery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@NamedQuery(name = "Customer.findNameByEmailId", query = "SELECT c.name FROM Customer c WHERE c.emailId = :emailId")
public class Customer {

    @Id
    private Integer customerId;
    private String emailId;
    private String name;
    private LocalDate dateOfBirth;

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", emailId='" + emailId + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (null == o || this.getClass() != o.getClass()) return false;
        final Customer customer = (Customer) o;
        return this.customerId.equals(customer.customerId) && this.emailId.equals(customer.emailId) && this.name.equals(customer.name) && this.dateOfBirth.equals(customer.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.customerId, this.emailId, this.name, this.dateOfBirth);
    }
}
