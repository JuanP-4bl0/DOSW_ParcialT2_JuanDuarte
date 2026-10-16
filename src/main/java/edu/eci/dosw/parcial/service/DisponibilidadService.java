package edu.eci.dosw.parcial.service;

import edu.eci.dosw.parcial.repository.DisponibilidadRepository;
import edu.eci.dosw.parcial.model.DisponibilidadModel;
import edu.eci.dosw.parcial.mapper.DisponibilidadMapper;
import edu.eci.dosw.parcial.entity.DisponibilidadEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DisponibilidadService {
    private static final Logger log = LoggerFactory.getLogger(DisponibilidadService.class);

    private final DisponibilidadRepository disponibilidadRepository;
    private final DisponibilidadMapper disponibilidadMapper;

    public DisponibilidadService(DisponibilidadRepository disponibilidadRepository, DisponibilidadMapper disponibilidadMapper){
        this.disponibilidadRepository = disponibilidadRepository;
        this.disponibilidadMapper = disponibilidadMapper;
    }

    /**
     Añade una nueva disponibilidad
     */
    @Transactional
    public DisponibilidadModel save(DisponibilidadModel disponibilidad){
        DisponibilidadModel saved = disponibilidadMapper.toModel(disponibilidadRepository.save(disponibilidadMapper.toEntity(disponibilidad)));
        log.info("Disponibilidad guardada con id: {}", saved.getId());
        return saved;
    }

    /**
     * Actualiza los datos de una disponibilidad
     */
    @Transactional
    public DisponibilidadModel update(Long id, DisponibilidadModel disponibilidad) {
        DisponibilidadEntity current = findEntity(id);
        log.info("Disponibilidad actualizada con id: {}", id);
        return disponibilidadMapper.toModel(disponibilidadRepository.save(current));
    }

    /**
     * Elimina una disponibilidad
     */
    @Transactional
    public void deleteById(Long id) {
        findEntity(id);
        disponibilidadRepository.deleteById(id);
        log.info("Usuario eliminado con id: {}", id);
    }

    @Transactional(readOnly = true)
    public DisponibilidadModel findById(Long id) {
        return disponibilidadMapper.toModel(findEntity(id));
    }

    @Transactional(readOnly = true)
    public List<DisponibilidadModel> findAll() {
        return disponibilidadRepository.findAll().stream().map(disponibilidadMapper::toModel).toList();
    }

    private DisponibilidadEntity findEntity(Long id) {
        return disponibilidadRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Disponibilidad con id {} no encontrada", id);
                    return new RuntimeException("Disponibilidad no encontrada");
                });
    }
}
