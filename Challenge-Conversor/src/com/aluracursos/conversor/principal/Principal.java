package com.aluracursos.conversor.principal;

import com.aluracursos.conversor.calculos.Control;
import com.aluracursos.conversor.calculos.Conversion;
import com.aluracursos.conversor.calculos.ExchangeRateService;
import com.aluracursos.conversor.modelos.VistaConsola;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ExchangeRateService servicio = new ExchangeRateService();
        Control control = new Control(servicio);
        VistaConsola vista = new VistaConsola();
        List<Conversion> historial = new ArrayList<>();

        System.out.println("Bienvenido al conversor de monedas.");

        boolean continuar = true;
        while (continuar) {
            vista.mostrarMonedasSoportadas();

            try {
                String monedaOrigen = vista.solicitarMoneda("Introduce la moneda de origen");
                String monedaDestino = vista.solicitarMoneda("Introduce la moneda de destino");
                double monto = vista.solicitarMonto();

                Conversion resultado = control.convertir(monedaOrigen, monedaDestino, monto);
                vista.mostrarConversion(resultado.toString());
                historial.add(resultado);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }

            continuar = vista.solicitarContinuar();
        }

        System.out.println("\nHistorial de conversiones realizadas:");
        historial.forEach(System.out::println);

        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
    }
}
