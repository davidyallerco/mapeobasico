package net.yallerco.mapeobasico.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import net.yallerco.mapeobasico.dto.EstudianteDto;
import net.yallerco.mapeobasico.dto.PersonaDto;
import net.yallerco.mapeobasico.persistence.entity.Persona;

@Mapper(componentModel = "spring")
public interface EstudianteMapper {
 
	EstudianteDto personaToEstudianteDto(Persona persona);
	
	@Mapping( target = "personaDto.pais", ignore = true) 
	@Mapping( target = "nombrePadre", ignore = true) 
	Persona EstudianteDtoToPersona(PersonaDto personaDto);
}
