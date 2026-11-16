package com.gabtavarez.simulador.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record SimulacaoRequest(
        @NotNull(message = "valor é obrigatório")
        @DecimalMin(value = "0.01", message = "valor deve ser maior que zero")
        BigDecimal valor,

        @NotNull(message = "prazoMeses é obrigatório")
        @Min(value = 1, message = "prazoMeses deve ser no mínimo 1")
        @Max(value = 480, message = "prazoMeses deve ser no máximo 480")
        Integer prazoMeses,

        @NotNull(message = "taxaJurosMensal é obrigatória")
        @DecimalMin(value = "0.0", message = "taxaJurosMensal não pode ser negativa")
        @DecimalMax(value = "100.0", message = "taxaJurosMensal deve ser no máximo 100")
        BigDecimal taxaJurosMensal
) {
}
