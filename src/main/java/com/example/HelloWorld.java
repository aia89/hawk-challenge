package com.example;

public class HelloWorld {

    public static String getMessage() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(getMessage());
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
                break;
            }
        }
    }
}
