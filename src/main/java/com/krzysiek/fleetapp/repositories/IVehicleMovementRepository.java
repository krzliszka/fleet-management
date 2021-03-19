package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.VehicleMovement;

@Repository
public interface IVehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
