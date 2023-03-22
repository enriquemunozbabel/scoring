package com.vehicle.renting.services;

import com.vehicle.renting.exceptions.RequiredMissingFieldException;
import com.vehicle.renting.models.Persona;
import com.vehicle.renting.models.RentaAnual;
import org.springframework.stereotype.Service;

public interface RentaAnualService {

    RentaAnual addRentaAnual(RentaAnual rentaAnual) throws RequiredMissingFieldException;
}
