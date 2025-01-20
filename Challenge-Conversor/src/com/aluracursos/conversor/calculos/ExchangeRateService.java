package com.aluracursos.conversor.calculos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateService {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/034e481cbbc43d129e08660f/latest/";

    public double obtenerTasaDeCambio(String monedaOrigen, String monedaDestino) {
        try {
            String urlString = API_URL + monedaOrigen;
            URL url = new URL(urlString);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonElement root = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonObject = root.getAsJsonObject();

            if (!"success".equals(jsonObject.get("result").getAsString())) {
                throw new RuntimeException("Error al obtener la tasa de cambio");
            }

            JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
            if (!rates.has(monedaDestino)) {
                throw new IllegalArgumentException("La moneda de destino no está soportada: " + monedaDestino);
            }

            return rates.get(monedaDestino).getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("Error al conectar con la API: " + e.getMessage());
        }
    }
}
