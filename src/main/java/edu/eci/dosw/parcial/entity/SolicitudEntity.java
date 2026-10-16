package edu.eci.dosw.parcial.entity;

import edu.eci.dosw.parcial.model.EstadoSolicitud;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "solicitudes")
public class SolicitudEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Una disponibilidad solo puede asignarse a una solicitud
    @OneToOne(optional = false)
    @JoinColumn(name = "disponibilidad_id", nullable = false, unique = true)
    private DisponibilidadEntity disponibilidad;

    @Column(name = "correo_solicitante", nullable = false, length = 150)
    private String correoSolicitante;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private EstadoSolicitud estado;
}
