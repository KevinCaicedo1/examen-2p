package com.examen.segundo.turno.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.segundo.turno.controller.dto.TurnoCalificacionRQ;
import com.examen.segundo.turno.controller.dto.TurnoRQ;
import com.examen.segundo.turno.controller.dto.TurnoUsuarioRQ;
import com.examen.segundo.turno.controller.mapper.TurnoMapper;
import com.examen.segundo.turno.model.Turno;
import com.examen.segundo.turno.service.TurnoService;

@RestController
@RequestMapping("/api/turno")
public class TurnoController {

    private final TurnoService turnoService;

    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @PostMapping()
    public ResponseEntity<Object> create(@RequestBody TurnoRQ turnoRQ) {
        try {
            Turno turno = TurnoMapper.mapToTurno(turnoRQ);
            turno = turnoService.crearTurno(turno);
            return ResponseEntity.ok(turno);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{numeroTurno}")
    public ResponseEntity<Object> update(@PathVariable("numeroTurno") Integer numeroTurno,
            @RequestBody TurnoUsuarioRQ turnoUsuarioRQ) {
        try {
            Turno turno = TurnoMapper.turnoUsuarioRQToTurno(turnoUsuarioRQ);
            turno = turnoService.actualizarTurno(numeroTurno, turno);
            return ResponseEntity.ok(turno);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/finalizar/{numeroTurno}")
    public ResponseEntity<Object> finalizar(@PathVariable("numeroTurno") Integer numeroTurno) {
        try {
            Turno turno = turnoService.finalizarTurno(numeroTurno);
            return ResponseEntity.ok(turno);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/calificar")
    public ResponseEntity<Object> calificar(@RequestBody TurnoCalificacionRQ turnoCalificacionRQ) {
        try {
            Turno turno = TurnoMapper.turnoCalificarRQToTurno(turnoCalificacionRQ);
            turno = turnoService.calificarTurno(turno);
            return ResponseEntity.ok(turno);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }


}
