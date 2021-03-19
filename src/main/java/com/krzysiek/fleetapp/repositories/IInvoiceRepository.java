package com.krzysiek.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krzysiek.fleetapp.models.Invoice;

@Repository
public interface IInvoiceRepository extends JpaRepository<Invoice, Integer> {

}
