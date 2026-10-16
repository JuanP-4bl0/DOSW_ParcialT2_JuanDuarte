package edu.eci.dosw.parcial.repository;

import edu.eci.dosw.parcial.entity.DisponibilidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DisponibilidadRepository extends JpaRepository<DisponibilidadEntity, Long> {
    List<DisponibilidadEntity> findByEmail(String email);
}