package com.examen.segundo.cliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.examen.segundo.cliente.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
    Cliente findByCedula(String cedula);

}
