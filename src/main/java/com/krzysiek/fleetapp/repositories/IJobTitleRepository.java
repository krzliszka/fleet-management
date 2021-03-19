package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.JobTitle;

@Repository
public interface IJobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
