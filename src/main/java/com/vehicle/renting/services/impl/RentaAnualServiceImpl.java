package com.vehicle.renting.services.impl;

import com.vehicle.renting.exceptions.RequiredMissingFieldException;
import com.vehicle.renting.mappers.DireccionMapper;
import com.vehicle.renting.mappers.PersonaMapper;
import com.vehicle.renting.mappers.ProfesionMapper;
import com.vehicle.renting.mappers.RentaAnualMapper;
import com.vehicle.renting.models.Persona;
import com.vehicle.renting.models.Profesion;
import com.vehicle.renting.models.RentaAnual;
import com.vehicle.renting.services.PersonaService;
import com.vehicle.renting.services.RentaAnualService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentaAnualServiceImpl implements RentaAnualService {

    private ProfesionMapper profesionMapper;
    private PersonaServiceImpl personaService;
    private RentaAnualMapper rentaAnualMapper;

    public RentaAnualServiceImpl(ProfesionMapper profesionMapper, PersonaServiceImpl personaService, RentaAnualMapper rentaAnualMapper) {
        this.profesionMapper = profesionMapper;
        this.personaService = personaService;
        this.rentaAnualMapper = rentaAnualMapper;
    }

    @Transactional
    @Override
    public RentaAnual addRentaAnual(RentaAnual rentaAnual) throws RequiredMissingFieldException {
        this.addProfesionRenta(rentaAnual.getProfesion());
        this.addPersonaRenta(rentaAnual.getPersona());
        this.rentaAnualMapper.insertRentaAnual(rentaAnual);
        return rentaAnual;
    }

    private Persona addPersonaRenta(Persona persona) throws RequiredMissingFieldException {
        this.personaService.addPersona(persona);
        return persona;
    }

    private Profesion addProfesionRenta(Profesion profesion){
        this.profesionMapper.insertProfesion(profesion);
        return profesion;
    }
}
