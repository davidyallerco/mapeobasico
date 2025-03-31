package net.yallerco.mapeobasico.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import net.yallerco.mapeobasico.dto.ObreroDto;
import net.yallerco.mapeobasico.persistence.entity.Persona;

@Mapper(componentModel = "spring")
public interface ObreroMapper {

	
	ObreroDto personaToObreroDto(Persona persona);

	
	Persona obreroDtoToPersona(ObreroDto obreroDto);
	
	@AfterMapping
    default void afterMapping(Persona persona, @MappingTarget ObreroDto obreroDto) {
        obreroDto.setNombrePadre("Sr. " + obreroDto.getNombrePadre());
    }

	
}
