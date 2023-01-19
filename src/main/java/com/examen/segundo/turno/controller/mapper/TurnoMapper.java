package com.examen.segundo.turno.controller.mapper;

import com.examen.segundo.turno.controller.dto.TurnoCalificacionRQ;
import com.examen.segundo.turno.controller.dto.TurnoRQ;
import com.examen.segundo.turno.controller.dto.TurnoUsuarioRQ;
import com.examen.segundo.turno.model.Turno;

public class TurnoMapper {

    public static Turno mapToTurno(TurnoRQ turnoRQ) {
        return Turno.builder()
                .cedulaCliente(turnoRQ.getCedulaCliente())
                .nombreCliente(turnoRQ.getNombreCliente())
                .build();
    }

    public static Turno turnoUsuarioRQToTurno(TurnoUsuarioRQ turnoUsuarioRQ) {
        return Turno.builder()
                .codigoUsuarioEjecutivo(turnoUsuarioRQ.getCodigoUsuarioEjecutivo())
                .nombreEjecutivo(turnoUsuarioRQ.getNombreEjecutivo())
                .build();
    }

    public static Turno turnoCalificarRQToTurno(TurnoCalificacionRQ turnoUsuarioRQ) {
        return Turno.builder()
                .cedulaCliente(turnoUsuarioRQ.getCedulaCliente())
                .numeroTurno(turnoUsuarioRQ.getNumeroTurno())
                .calificacion(turnoUsuarioRQ.getCalificacion())
                .build();
    }
    
}
