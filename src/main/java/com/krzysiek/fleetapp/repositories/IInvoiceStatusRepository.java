package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.InvoiceStatus;

@Repository
public interface IInvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

}
