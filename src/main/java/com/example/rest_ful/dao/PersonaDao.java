package com.example.rest_ful.dao;

import com.example.rest_ful.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Integer> {
}
