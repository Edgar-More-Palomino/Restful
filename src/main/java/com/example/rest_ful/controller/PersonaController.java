package com.example.rest_ful.controller;

import com.example.rest_ful.dao.PersonaDao;
import com.example.rest_ful.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaDao personaDao;

    //Metodos Http - solicitud al servidor

    //POST
    //localhost:8080/persona/guardar
    @PostMapping
    public void save(@RequestBody Persona persona) {
        personaDao.save(persona);
    }

    //GET
    //localhost:8080/persona/listar
    @GetMapping
    public List<Persona> list() {
        return personaDao.findAll();
    }

    //DELETE
    //localhost:8080/persona/eliminar/1
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id) {
        personaDao.deleteById(id);
    }

    //PUT
    //localhost:8080/persona/actualizar
    @PutMapping("update")
    public void update(@RequestBody Persona persona) {
        personaDao.save(persona);
    }


}
