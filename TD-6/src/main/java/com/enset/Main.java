package com.enset;

public class Main {
    public static void main(String[] args) {
        Resource resource = new ProxyResource();

        // The actual object is created when the operation is executed
        resource.operation();

        resource.operation();

    }
}