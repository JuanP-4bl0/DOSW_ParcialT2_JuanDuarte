package edu.eci.dosw.parcial.service;

import edu.eci.dosw.parcial.repository.SolicitudRepository;
import edu.eci.dosw.parcial.model.SolicitudModel;
import edu.eci.dosw.parcial.mapper.SolicitudMapper;
import edu.eci.dosw.parcial.entity.SolicitudEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SolicitudService {
    private static final Logger log = LoggerFactory.getLogger(SolicitudService.class);
    
    private final SolicitudRepository solicitudRepository;
    private final SolicitudMapper solicitudMapper;

    public SolicitudService(SolicitudRepository solicitudRepository, SolicitudMapper solicitudMapper){
        this.solicitudRepository = solicitudRepository;
        this.solicitudMapper = solicitudMapper;
    }

    /**
     Añade una nueva solicitud
     */
    @Transactional
    public SolicitudModel save(SolicitudModel solicitud){
        SolicitudModel saved = solicitudMapper.toModel(solicitudRepository.save(solicitudMapper.toEntity(solicitud)));
        log.info("Disponibilidad guardada con id: {}", saved.getId());
        return saved;
    }
}
