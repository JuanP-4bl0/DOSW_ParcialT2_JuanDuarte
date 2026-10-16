package edu.eci.dosw.parcial.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import edu.eci.dosw.parcial.entity.SolicitudEntity;
import edu.eci.dosw.parcial.model.SolicitudModel;

@Mapper(componentModel = "spring")
public interface SolicitudMapper {

    @Mapping(target = "disponibilidadId", source = "disponibilidad.id")
    SolicitudModel toModel(SolicitudEntity entity);

    // La disponibilidad la asigna el servicio a partir de disponibilidadId
    @Mapping(target = "disponibilidad", ignore = true)
    SolicitudEntity toEntity(SolicitudModel model);
}
