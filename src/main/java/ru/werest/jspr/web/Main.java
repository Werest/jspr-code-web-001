package ru.werest.jspr.web;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();

        // добавление хендлеров (обработчиков)
        server.addHandler("GET", "/messages", (request, responseStream) -> {
            try {
                server.customReponse(responseStream, 423, "Not found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        server.addHandler("POST", "/messages", (request, responseStream) -> {
            try {
                server.customReponse(responseStream, 401, "Not found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        server.run();
    }
}