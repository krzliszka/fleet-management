package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.Country;

@Repository
public interface ICountryRepository extends JpaRepository<Country, Integer> {

}
