package com.examen.segundo.cliente.model;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "cliente")
@CompoundIndexes(
    {
        @CompoundIndex(name = "idex_cedulayemail", def = "{'cedula': 1, 'email': 1}", unique = true),
    }
)
public class Cliente {
    @Id
    private String id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;
    private String email;

    private List<Cuenta> cuentas;

    @Version
    private Long version;
    
}
