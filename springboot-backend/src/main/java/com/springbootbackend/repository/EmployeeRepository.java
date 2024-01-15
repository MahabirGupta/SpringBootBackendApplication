package com.springbootbackend.repository;

import com.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {//Long is the type of the primary key

//    Do not need to create any methods because JpaRepository has methods in built
}
