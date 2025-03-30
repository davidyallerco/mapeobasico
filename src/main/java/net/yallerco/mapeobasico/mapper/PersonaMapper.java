package net.yallerco.mapeobasico.mapper;

import org.mapstruct.Mapper;

import net.yallerco.mapeobasico.dto.PersonaDto;
import net.yallerco.mapeobasico.persistence.entity.Persona;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

	PersonaDto toDto(Persona persona);
	
	Persona personaDtoToPersona(PersonaDto personaDto);
	
}
