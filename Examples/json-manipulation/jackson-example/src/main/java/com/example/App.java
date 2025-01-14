package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        Book book = new Book(1, "Bible", "God");

        ObjectMapper objectMapper = new ObjectMapper();

        String json = "";

        try {
            json = objectMapper.writeValueAsString(book);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        System.out.println(json);
    }
}
