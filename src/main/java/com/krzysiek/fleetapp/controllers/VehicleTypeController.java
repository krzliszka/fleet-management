package com.krzysiek.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {
	
	@GetMapping("/vehicletypes")
	public String getVehicleTypes() {
		return "vehicle-type";
	}

}
