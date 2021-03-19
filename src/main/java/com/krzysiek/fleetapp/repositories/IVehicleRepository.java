package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.Vehicle;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Integer> {

}
