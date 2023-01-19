package com.examen.segundo.turno.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import com.examen.segundo.turno.model.Turno;
import com.examen.segundo.turno.repository.TurnoRepository;

@Service
public class TurnoService {

    private final TurnoRepository turnoRepository;

    public TurnoService(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    // Crear turno
    public Turno crearTurno(Turno turno) {
        // Obtener el ultimo numero de turno
        List<Turno> turnos = turnoRepository.findAll();
        int ultimoTurno = turnos.get(turnos.size() - 1).getNumeroTurno();
        LocalDateTime fechaHoraCreacion = LocalDateTime.now();
        turno.setFechaHoraGeneracion(fechaHoraCreacion);
        // Crear el turno
        turno.setNumeroTurno(ultimoTurno + 1);
        // Guardar el turno
        return turnoRepository.save(turno);
    }

    public Turno obtenerTurno(Integer numeroTurno) {
        return turnoRepository.findByNumeroTurno(numeroTurno);
    }

    public Turno actualizarTurno(Integer numeroTurno, Turno turno) {
        Turno turnoActual = turnoRepository.findByNumeroTurno(numeroTurno);
        turnoActual.setCodigoUsuarioEjecutivo(turno.getCodigoUsuarioEjecutivo());
        turnoActual.setNombreEjecutivo(turno.getNombreEjecutivo());
        LocalDateTime fechaHoraInicioAtencion = LocalDateTime.now();
        turnoActual.setFechaHoraInicioAtencion(fechaHoraInicioAtencion);
        return turnoRepository.save(turnoActual);
    }

    public Turno finalizarTurno(Integer numeroTurno) {
        Turno turnoActual = turnoRepository.findByNumeroTurno(numeroTurno);
        LocalDateTime fechaHoraFinAtencion = LocalDateTime.now();
        turnoActual.setFechaHoraFinAtencion(fechaHoraFinAtencion);
        return turnoRepository.save(turnoActual);

    }

    public Turno calificarTurno(Turno turno) {
        Turno turnoActual = turnoRepository.findByNumeroTurno(turno.getNumeroTurno());
        turnoActual.setCalificacion(turno.getCalificacion());
        return turnoRepository.save(turnoActual);

    }

}
