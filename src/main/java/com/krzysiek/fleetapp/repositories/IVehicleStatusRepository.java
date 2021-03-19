package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.VehicleStatus;

@Repository
public interface IVehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
