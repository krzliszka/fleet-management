package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.State;

@Repository
public interface IStateRepository extends JpaRepository<State, Integer> {

}
