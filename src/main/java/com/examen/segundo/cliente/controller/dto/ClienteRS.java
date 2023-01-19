package com.examen.segundo.cliente.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteRS {
    private String cedula;
    private String nombre;
    private String apellido;
}
