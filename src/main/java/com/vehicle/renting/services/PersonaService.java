package com.vehicle.renting.services;

import com.vehicle.renting.exceptions.RequiredMissingFieldException;
import com.vehicle.renting.models.Persona;

public interface PersonaService {

    Persona addPersona(Persona persona) throws RequiredMissingFieldException;
}
