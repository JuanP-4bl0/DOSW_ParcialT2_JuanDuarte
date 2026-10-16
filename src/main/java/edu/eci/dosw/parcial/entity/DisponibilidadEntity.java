package edu.eci.dosw.parcial.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import edu.eci.dosw.parcial.model.EstadoDisponibilidad;
import edu.eci.dosw.parcial.model.Modalidad;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "disponibilidades")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DisponibilidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;

    @Column(name = "hora_fin", nullable = false)
    private LocalTime horaFin;

    @Column(length = 100)
    private String lugar;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Modalidad modalidad;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private EstadoDisponibilidad estado;

    @Column(name = "correo_tutor", nullable = false, length = 150)
    private String correoTutor;

    @Column(nullable = false, length = 20)
    private String materia;

    @OneToOne(mappedBy = "disponibilidad")
    private SolicitudEntity solicitud;
}
