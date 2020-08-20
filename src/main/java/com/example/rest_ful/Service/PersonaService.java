package com.example.rest_ful.Service;

import com.example.rest_ful.Dao.PersonaDao;
import com.example.rest_ful.Model.Persona;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaService {

    @Autowired
    private PersonaDao personaDao;

    //Metodos Http - solicitud al servidor

    //POST
    //localhost:8080/persona/guardar
    @PostMapping("/guardar")
    public void guardar(@RequestBody Persona persona)
    {
        personaDao.save(persona);
    }

    @GetMapping("/listar")
    public List<Persona>listar()
    {
        return personaDao.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    public  void  eliminar(@PathVariable("id")Integer id)
    {
        personaDao.deleteById(id);
    }

    @PutMapping("/actualizar")
    public  void  actualizar(@RequestBody Persona persona)
    {
        personaDao.save(persona);
    }

}
