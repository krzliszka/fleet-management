package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.Location;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Integer> {

}
