package com.example;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book(1, "Bible", "God");

        Gson gson = new Gson();

        String json = gson.toJson(book);

        System.out.println(json);
    }
}
