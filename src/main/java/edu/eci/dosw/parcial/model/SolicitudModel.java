package edu.eci.dosw.parcial.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SolicitudModel {

    private Long id;
    private Long disponibilidadId;
    private String correoSolicitante;
    private EstadoSolicitud estado;
}
