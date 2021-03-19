package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
