package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
