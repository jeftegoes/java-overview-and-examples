package com.example.loose.coupling.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class AppConfiguration {
    @Bean
    public String name() {
        return "Brenno";
    }

    @Bean
    public int age() {
        return 8;
    }

    @Bean
    public Person person() {
        return new Person("Jefté", 33, new Address("Av. ACM", "Salvador"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "myCustomBean")
    public Address address() {
        return new Address("Av. ACM", "Salvador");
    }
}
