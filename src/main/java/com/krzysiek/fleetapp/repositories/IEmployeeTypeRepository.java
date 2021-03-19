package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.EmployeeType;

@Repository
public interface IEmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
