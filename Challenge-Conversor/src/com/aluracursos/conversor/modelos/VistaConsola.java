package com.aluracursos.conversor.modelos;

import com.aluracursos.conversor.modelos.Moneda;

import java.util.Scanner;

public class VistaConsola {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMonedasSoportadas() {
        System.out.println("Monedas soportadas: " + Moneda.MONEDAS_SOPORTADAS);
    }

    public String solicitarMoneda(String mensaje) {
        while (true) {
            System.out.print(mensaje + " (3 letras): ");
            String codigo = scanner.nextLine().toUpperCase();

            if (codigo.length() != 3) {
                System.out.println("El código de la moneda debe tener exactamente 3 letras. Intenta nuevamente.");
                continue;
            }

            if (!Moneda.esMonedaValida(codigo)) {
                System.out.println("El código de la moneda no es válido o no está soportado. Intenta nuevamente.");
                continue;
            }

            return codigo; // Moneda válida
        }
    }

    public double solicitarMonto() {
        while (true) {
            System.out.print("Introduce el monto a convertir: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("El monto debe ser un número válido. Intenta nuevamente.");
                scanner.next(); // Limpiar entrada inválida
                continue;
            }
            double monto = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            if (monto <= 0) {
                System.out.println("El monto debe ser mayor que 0. Intenta nuevamente.");
                continue;
            }
            return monto;
        }
    }

    public boolean solicitarContinuar() {
        System.out.print("¿Deseas realizar otra conversión? (sí/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta.equals("sí") || respuesta.equals("si");
    }

    public void mostrarConversion(String mensaje) {
        System.out.println(mensaje);
    }
}
