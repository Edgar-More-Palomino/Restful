package com.example.rest_ful.Dao;

import com.example.rest_ful.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Integer> {
}
