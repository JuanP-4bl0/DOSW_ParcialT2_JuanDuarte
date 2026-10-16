package edu.eci.dosw.parcial.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

    public DisponibilidadModel(){

    }

    public DisponibilidadModel(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, String lugar, Modalidad modalidad, String correoTutor, String materia) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugar = lugar;
        this.modalidad = modalidad;
        this.correoTutor = correoTutor;
        this.materia = materia;
        estado = EstadoDisponibilidad.LIBRE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getfecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
