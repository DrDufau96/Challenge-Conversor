package com.aluracursos.conversor.calculos;

import com.aluracursos.conversor.calculos.Conversion;
import com.aluracursos.conversor.calculos.ExchangeRateService;

public class Control {
    private final ExchangeRateService servicio;

    public Control(ExchangeRateService servicio) {
        this.servicio = servicio;
    }

    public Conversion convertir(String monedaOrigen, String monedaDestino, double monto) {
        double tasa = servicio.obtenerTasaDeCambio(monedaOrigen, monedaDestino);
        double montoConvertido = monto * tasa;
        return new Conversion(monedaOrigen, monedaDestino, monto, montoConvertido);
    }
}
