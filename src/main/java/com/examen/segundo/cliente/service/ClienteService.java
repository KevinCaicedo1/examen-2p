package com.examen.segundo.cliente.service;

import org.springframework.stereotype.Service;

import com.examen.segundo.cliente.model.Cliente;
import com.examen.segundo.cliente.repository.ClienteRepository;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente findByCedula(String cedula) {
        return clienteRepository.findByCedula(cedula);
    }


}