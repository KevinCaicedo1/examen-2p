package com.examen.segundo.cliente.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;
// Numero Cuenta,Tipo de Cuenta (AHORROS, CORRIENTE, INVERSION),Saldo Promedio
@Data
@NoArgsConstructor
public class Cuenta {
    private String numeroCuenta;
    private String tipoCuenta;
    private BigDecimal saldoPromedio;
}
