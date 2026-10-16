package edu.eci.dosw.parcial.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import edu.eci.dosw.parcial.entity.SolicitudEntity;
import edu.eci.dosw.parcial.model.SolicitudModel;

@Mapper(componentModel = "spring")
public interface SolicitudMapper {

    SolicitudModel toModel(SolicitudEntity entity);
    
    SolicitudEntity toEntity(SolicitudModel model);
}