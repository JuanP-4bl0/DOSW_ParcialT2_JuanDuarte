package edu.eci.dosw.parcial.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import edu.eci.dosw.parcial.entity.DisponibilidadEntity;
import edu.eci.dosw.parcial.model.DisponibilidadModel;

@Mapper(componentModel = "spring")
public interface DisponibilidadMapper {

    DisponibilidadModel toModel(DisponibilidadEntity entity);

    DisponibilidadEntity toEntity(DisponibilidadModel model);

    List<DisponibilidadModel> toModelList(List<DisponibilidadEntity> entities);
}
