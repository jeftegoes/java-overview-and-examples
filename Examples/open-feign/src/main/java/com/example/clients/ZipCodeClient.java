package com.example.clients;

import com.example.responses.AddressResponse;
import feign.Param;
import feign.RequestLine;


public interface ZipCodeClient {
    @RequestLine("GET {zipCode}/json/")
    AddressResponse getZipCode(@Param("zipCode") String zipCode);
}
