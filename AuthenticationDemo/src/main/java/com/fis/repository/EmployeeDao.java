package com.fis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fis.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
