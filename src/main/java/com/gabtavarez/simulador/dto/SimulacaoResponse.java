package com.gabtavarez.simulador.dto;

import java.math.BigDecimal;
import java.util.List;

public record SimulacaoResponse(
        String sistema,
        BigDecimal valorFinanciado,
        int prazoMeses,
        BigDecimal taxaJurosMensal,
        BigDecimal totalPago,
        BigDecimal totalJuros,
        List<ParcelaResponse> parcelas
) {
}