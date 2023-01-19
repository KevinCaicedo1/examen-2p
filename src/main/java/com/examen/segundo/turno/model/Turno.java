package com.examen.segundo.turno.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Document(collection = "turno")
public class Turno {
    @Id
    private String id;
    private Integer numeroTurno;
    private String cedulaCliente;
    private String nombreCliente;
    private String codigoUsuarioEjecutivo;
    private String nombreEjecutivo;
    private LocalDateTime fechaHoraGeneracion;
    private LocalDateTime fechaHoraInicioAtencion;
    private LocalDateTime fechaHoraFinAtencion;
    private Integer calificacion;
    
}
