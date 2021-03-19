package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.VehicleType;

@Repository
public interface IVehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
