package edu.eci.dosw.parcial.model;

public class SolicitudModel {
    private Long id;
    private Long disponibilidadId;
    private String correoSolicitante;
    private EstadoSolicitud estado;

    public SolicitudModel(){

    }

    public SolicitudModel(Long disponibilidadId, String correoSolicitante, EstadoSolicitud estado){
        this.disponibilidadId = disponibilidadId;
        this.correoSolicitante = correoSolicitante;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
