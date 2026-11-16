package com.gabtavarez.simulador.dto;

import java.math.BigDecimal;

public record ParcelaResponse(
        int numero,
        BigDecimal valorParcela,
        BigDecimal juros,
        BigDecimal amortizacao,
        BigDecimal saldoDevedor
) {
}
