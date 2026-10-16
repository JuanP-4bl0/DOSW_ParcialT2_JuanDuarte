package edu.eci.dosw.parcial.controller;

import edu.eci.dosw.parcial.model.SolicitudModel;
import edu.eci.dosw.parcial.service.SolicitudService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/solicitud")
@Tag(name = "Solicitud", description = "Operaciones relacionadas con las solicitudes")
public class SolicitudController {
    private final SolicitudService solicitudService;

    public SolicitudController(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }

    @PostMapping
    @Operation(summary = "Crear disponibilidad", description = "Registra una nueva disponibilidad en la plataforma")
    public ResponseEntity<SolicitudModel> create(@Valid @RequestBody SolicitudModel user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(solicitudService.save(user));
    }
}
