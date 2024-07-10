package com.sistema.calculos;

import com.google.gson.JsonObject;

public class CalculadoraMonedas {
    public static double convertirMoneda(JsonObject tasas, String monedaOrigen, String monedaDestino, double cantidad) {
        if (!tasas.has(monedaOrigen) || !tasas.has(monedaDestino)) {
            throw new IllegalArgumentException("Código de moneda no válido.");
        }

        double tasaOrigen = tasas.get(monedaOrigen).getAsDouble();
        double tasaDestino = tasas.get(monedaDestino).getAsDouble();

        return cantidad / tasaOrigen * tasaDestino;
    }
}
