package com.vehicle.renting.controllers;

import com.vehicle.renting.exceptions.RequiredMissingFieldException;
import com.vehicle.renting.models.Persona;
import com.vehicle.renting.models.RentaAnual;
import com.vehicle.renting.services.PersonaService;
import com.vehicle.renting.services.RentaAnualService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentaAnualController {

    RentaAnualService rentaAnualService;

    public RentaAnualController(RentaAnualService rentaAnualService) {
        this.rentaAnualService = rentaAnualService;
    }

    @PostMapping("/renta")
    ResponseEntity addRentaAnual(@RequestBody RentaAnual rentaAnual) throws RequiredMissingFieldException {
        this.rentaAnualService.addRentaAnual(rentaAnual);
        return ResponseEntity.ok(rentaAnual);
    }

}
