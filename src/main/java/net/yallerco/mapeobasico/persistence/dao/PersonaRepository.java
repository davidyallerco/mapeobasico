package net.yallerco.mapeobasico.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.yallerco.mapeobasico.persistence.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
