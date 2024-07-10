package com.sistema.conversor;

import com.google.gson.JsonObject;
import com.sistema.calculos.CalculadoraMonedas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Obteniendo tasas de cambio...");
        JsonObject tasas = ConversorMonedas.obtenerTasasCambio();

        if (tasas == null) {
            System.out.println("No se pudieron obtener las tasas de cambio. Inténtalo más tarde.");
            return;
        }

        while (true) {
            System.out.println("================================");
            System.out.println("Seleccione la moneda de origen:");
            String monedaOrigen = obtenerCodigoMoneda(escaner);

            System.out.println("Seleccione la moneda de destino:");
            String monedaDestino = obtenerCodigoMoneda(escaner);

            System.out.println("Ingrese la cantidad a convertir:");
            double cantidad = 0.0;

            try {
                cantidad = escaner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                escaner.next();
                continue;
            }

            try {
                double cantidadConvertida = CalculadoraMonedas.convertirMoneda(tasas, monedaOrigen, monedaDestino, cantidad);
                System.out.printf("Resultado: %.2f %s = %.2f %s%n", cantidad, monedaOrigen, cantidadConvertida, monedaDestino);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("================================");
            System.out.println("¿Desea realizar otra conversión? (s/n)");
            String otra = escaner.next();
            if (!otra.equalsIgnoreCase("s")) {
                break;
            }
        }

        escaner.close();
        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
    }

    private static String obtenerCodigoMoneda(Scanner escaner) {
        System.out.println("Opciones:");
        System.out.println("1. ARS - Peso argentino");
        System.out.println("2. BOB - Boliviano boliviano");
        System.out.println("3. BRL - Real brasileño");
        System.out.println("4. CLP - Peso chileno");
        System.out.println("5. COP - Peso colombiano");
        System.out.println("6. USD - Dólar estadounidense");
        System.out.println("7. Salir");
        System.out.print("Introduzca el número de su opción: ");

        try {
            int opcion = escaner.nextInt();
            switch (opcion) {
                case 1:
                    return "ARS";
                case 2:
                    return "BOB";
                case 3:
                    return "BRL";
                case 4:
                    return "CLP";
                case 5:
                    return "COP";
                case 6:
                    return "USD";
                case 7:
                    System.out.println("Saliendo del programa...");
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Seleccionando USD por defecto.");
                    return "USD";
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Seleccionando USD por defecto.");
            escaner.next();
            return "USD";
        }
    }
}
