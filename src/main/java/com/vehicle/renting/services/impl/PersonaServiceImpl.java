package com.vehicle.renting.services.impl;

import com.vehicle.renting.exceptions.RequiredMissingFieldException;
import com.vehicle.renting.mappers.DireccionMapper;
import com.vehicle.renting.mappers.PersonaMapper;
import com.vehicle.renting.models.Persona;
import com.vehicle.renting.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private DireccionMapper direccionMapper;
    private PersonaMapper personaMapper;

    public PersonaServiceImpl(DireccionMapper direccionMapper, PersonaMapper personaMapper) {
        this.direccionMapper = direccionMapper;
        this.personaMapper = personaMapper;
    }

    @Transactional
    @Override
    public Persona addPersona(Persona persona) throws RequiredMissingFieldException {
        this.validatePersonaData(persona);
        persona=this.addDireccionPersona(persona);
        this.personaMapper.insertPersona(persona);
        return persona;
    }

    private Persona addDireccionPersona(Persona persona) {
        this.direccionMapper.insertDireccion(persona.getDireccionDomicilio());

        if(persona.isDireccionDomicilioIgualNotificacion()){
            persona.setDireccionNotificacion(persona.getDireccionDomicilio());
        }
        else {
            this.direccionMapper.insertDireccion(persona.getDireccionNotificacion());
        }

        return persona;
    }

    private void validatePersonaData(Persona persona) throws RequiredMissingFieldException {
        this.validateNombre(persona);
    }

    private void validateNombre(Persona persona) throws RequiredMissingFieldException {
        if(persona.getNombre()==null||persona.getNombre().isEmpty()){
            throw new RequiredMissingFieldException();
        }
    }
}
