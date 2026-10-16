package edu.eci.dosw.parcial.model;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DisponibilidadModel {

    private Long id;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String lugar;
    private Modalidad modalidad;
    private EstadoDisponibilidad estado;
    private String correoTutor;
    private String materia;
}
