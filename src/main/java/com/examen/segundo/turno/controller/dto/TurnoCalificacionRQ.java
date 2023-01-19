package com.examen.segundo.turno.controller.dto;

import lombok.Data;

@Data
public class TurnoCalificacionRQ {
    private String cedulaCliente;
    private Integer numeroTurno;
    private Integer calificacion;
    
}
