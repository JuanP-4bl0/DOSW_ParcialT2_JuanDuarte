package edu.eci.dosw.parcial.repository;

import edu.eci.dosw.parcial.entity.SolicitudEntity;
import edu.eci.dosw.parcial.entity.DisponibilidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SolicitudRepository extends JpaRepository<SolicitudEntity, Long> {
    List<SolicitudEntity> findByDisponibilidad(DisponibilidadEntity disponibilidad);
}