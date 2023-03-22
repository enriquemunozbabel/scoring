package com.vehicle.renting.controllers;

import com.vehicle.renting.exceptions.RequiredMissingFieldException;
import com.vehicle.renting.models.Persona;
import com.vehicle.renting.services.PersonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/persona")
    ResponseEntity addPersona(@RequestBody Persona persona) throws RequiredMissingFieldException {
        this.personaService.addPersona(persona);
        return ResponseEntity.ok(persona);
    }

}
