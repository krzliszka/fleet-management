package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {

}
