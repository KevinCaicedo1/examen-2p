package com.examen.segundo.cliente.controller.mapper;

import com.examen.segundo.cliente.controller.dto.ClienteRS;
import com.examen.segundo.cliente.model.Cliente;

public class ClienteMapper {
    public static ClienteRS toClienteRS(Cliente test) {
        return ClienteRS.builder()
                .cedula(test.getCedula())
                .nombre(test.getNombre())
                .apellido(test.getApellido())
                .build();
    }

}
