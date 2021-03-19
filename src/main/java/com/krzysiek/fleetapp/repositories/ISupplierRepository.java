package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.Supplier;

@Repository
public interface ISupplierRepository extends JpaRepository<Supplier, Integer> {

}
