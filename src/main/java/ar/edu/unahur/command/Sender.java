package ar.edu.unahur.command;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Sender {
    private final OkHttpClient client;
    private final String urlDestino;

    public Sender(String urlDestino) {
        this.client = new OkHttpClient();
        this.urlDestino = urlDestino;
    }

    public void enviarMovimiento(int x, int y, int pasos) {
        String json = String.format("{\"x\": %d, \"y\": %d, \"pasos\": %d}", x, y, pasos);

        RequestBody body = RequestBody.create(
                json,
                MediaType.parse("application/json"));

        Request request = new Request.Builder()
                .url(urlDestino)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
        } catch (IOException e) {
            System.err.println("Error al enviar movimiento: " + e.getMessage());
        }
    }
}
