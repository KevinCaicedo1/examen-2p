package com.examen.segundo.turno.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.examen.segundo.turno.model.Turno;

public interface TurnoRepository extends MongoRepository<Turno, String> {

    Turno findByNumeroTurno(Integer numeroTurno);
}
