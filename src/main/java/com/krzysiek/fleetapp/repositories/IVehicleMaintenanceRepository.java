package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.VehicleMaintenance;

@Repository
public interface IVehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {

}
