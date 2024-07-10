package com.sistema.conversor;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMonedas {
    private static final String CLAVE_API = "232c9817bbcadfbb758f221f";
    private static final String URL_API = "https://v6.exchangerate-api.com/v6/" + CLAVE_API + "/latest/USD";

    public static JsonObject obtenerTasasCambio() {
        try {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(URI.create(URL_API))
                    .build();

            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            JsonObject respuestaJson = gson.fromJson(respuesta.body(), JsonObject.class);

            return respuestaJson.getAsJsonObject("conversion_rates");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
