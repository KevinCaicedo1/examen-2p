package com.examen.segundo.cliente.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.segundo.cliente.controller.dto.ClienteRS;
import com.examen.segundo.cliente.controller.mapper.ClienteMapper;
import com.examen.segundo.cliente.model.Cliente;
import com.examen.segundo.cliente.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @GetMapping("/cedula/{cedula}")
    public ResponseEntity<ClienteRS> findByCedula(String cedula) {
        Cliente cliente = clienteService.findByCedula(cedula);
        if(cliente == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(ClienteMapper.toClienteRS(cliente));
    }





}
