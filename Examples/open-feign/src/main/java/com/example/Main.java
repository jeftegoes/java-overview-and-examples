package com.example;

import com.example.clients.ZipCodeClient;
import com.example.entities.Address;
import com.example.mappers.AddressResponseMapper;
import com.example.responses.AddressResponse;
import feign.Feign;
import feign.gson.GsonDecoder;

public class Main {
    private static String HOST = "https://viacep.com.br/ws/";

    public static void main(String[] args) {
        ZipCodeClient zipCodeClient = Feign.builder().decoder(new GsonDecoder()).target(ZipCodeClient.class, HOST);

        AddressResponse addressResponse = zipCodeClient.getZipCode("01001000");

        Address address = AddressResponseMapper.INSTANCE.toAddress(addressResponse);

        System.out.println(address.getState());
    }
}