package edu.eci.dosw.parcial.controller;

import edu.eci.dosw.parcial.model.DisponibilidadModel;
import edu.eci.dosw.parcial.service.DisponibilidadService;
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
@RequestMapping("/api/disponibilidad")
@Tag(name = "Disponibilidad", description = "Operaciones relacionadas con la disponibilidad")
public class DisponibilidadController {
    private final DisponibilidadService disponibilidadService;

    public DisponibilidadController(DisponibilidadService disponibilidadService) {
        this.disponibilidadService = disponibilidadService;
    }

    @PostMapping
    @Operation(summary = "Crear disponibilidad", description = "Registra una nueva disponibilidad en la plataforma")
    public ResponseEntity<DisponibilidadModel> create(@Valid @RequestBody DisponibilidadModel user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(disponibilidadService.save(user));
    }

    @GetMapping
    @Operation(summary = "Listar disponibilidades", description = "Devuelve las disponibilidades")
    public ResponseEntity<List<DisponibilidadModel>> findAll() {
        return ResponseEntity.ok(disponibilidadService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener disponibilidad por ID", description = "Devuelve una disponibilidad a partir de su identificador")
    public ResponseEntity<DisponibilidadModel> findById(@PathVariable Long id) {
        return ResponseEntity.ok(disponibilidadService.findById(id));
    }
}
