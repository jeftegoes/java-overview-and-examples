package org.example;

import java.time.LocalDateTime;

public class Main {
    static void main() {
        System.out.println("Hello and welcome!");

        while (true) {
            try {
                System.out.println("Current date/time: " + LocalDateTime.now());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
