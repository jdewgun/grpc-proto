package com.jdewgun.github.calculator.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new CalculatorServiceImpl())
                .build()
                .start();

        System.out.println("Server Built and Started Successfully");

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Received Shutdown Call.");
            server.shutdown();
            System.out.println("Server Disconnected Successfully.");
        }));

        server.awaitTermination();
    }
}
