package com.aluracursos.conversor.modelos;

import java.util.Set;

public class Moneda {
    // Lista de las 10 monedas más utilizadas
    public static final Set<String> MONEDAS_SOPORTADAS = Set.of(
            "USD", "EUR", "JPY", "GBP", "AUD",
            "CAD", "CHF", "CNY", "SEK", "NZD"
    );

    public static boolean esMonedaValida(String codigo) {
        return MONEDAS_SOPORTADAS.contains(codigo);
    }
}
