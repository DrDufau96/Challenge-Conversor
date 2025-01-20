package com.aluracursos.conversor.calculos;

import com.aluracursos.conversor.modelos.Moneda;

public record Conversion(String monedaOrigen, String monedaDestino, double monto, double montoConvertido) {

    public Conversion {
        if (!Moneda.esMonedaValida(monedaOrigen)) {
            throw new IllegalArgumentException("Moneda de origen no válida: " + monedaOrigen);
        }
        if (!Moneda.esMonedaValida(monedaDestino)) {
            throw new IllegalArgumentException("Moneda de destino no válida: " + monedaDestino);
        }
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que 0.");
        }
    }

    @Override
    public String toString() {
        return String.format("%.2f %s = %.2f %s", monto, monedaOrigen, montoConvertido, monedaDestino);
    }
}
