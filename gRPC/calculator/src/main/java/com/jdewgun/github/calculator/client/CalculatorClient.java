package com.jdewgun.github.calculator.client;

import com.jdewgun.github.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.omg.CORBA.TIMEOUT;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {

    public void run() {
        int port = 50051;
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();

        //makeUnaryCall(channel);
        //makeServerStreamingCall(channel);
        //makeClientStreamingCall(channel);
        makeBiDirectionalStreamingCall(channel);

        channel.shutdown();
    }

    private void makeUnaryCall(ManagedChannel channel) {

        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        SumRequest sumRequest = SumRequest.newBuilder()
                .setFirstNumber(4)
                .setSecondNumber(3)
                .build();

        SumResponse sumResponse = stub.sum(sumRequest);

        System.out.println(
                sumRequest.getFirstNumber() +
                        " + " +
                        sumRequest.getSecondNumber() +
                        " = " +
                        sumResponse.getSumResult()
        );
    }

    private void makeServerStreamingCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        int numberToDecompose = 120;

        stub.primeNumberDecomposition(PrimeNumberDecomposeRequest.newBuilder()
                .setNumberToDecompose(numberToDecompose).build())
                .forEachRemaining(primeNumberDecomposeResponse -> {
                    System.out.println(primeNumberDecomposeResponse.getDecompositionResult());
                });

    }


    private void makeClientStreamingCall(ManagedChannel channel) {
        // Create Asynchronous Client
        CalculatorServiceGrpc.CalculatorServiceStub asyncClient = CalculatorServiceGrpc.newStub(channel);


        // Create Countdown Latch
        CountDownLatch latch = new CountDownLatch(1);
        // Create the Async Client and then override the methods
        StreamObserver<ComputeAverageRequest> requestStreamObserver = asyncClient.computeAverage(new StreamObserver<ComputeAverageResponse>() {
            @Override
            public void onNext(ComputeAverageResponse value) {
                System.out.println("Received a response from the server");
                System.out.println(value.getAvgResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Server Has Returned all Results");
                latch.countDown();
            }
        });

        requestStreamObserver.onNext(ComputeAverageRequest
                .newBuilder()
                .setNumber(1)
                .build());

        requestStreamObserver.onNext(ComputeAverageRequest
                .newBuilder()
                .setNumber(2)
                .build());

        requestStreamObserver.onNext(ComputeAverageRequest
                .newBuilder()
                .setNumber(3)
                .build());

        requestStreamObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void makeBiDirectionalStreamingCall (ManagedChannel channel) {
        // Create Asynchronous Client
        CalculatorServiceGrpc.CalculatorServiceStub asyncClient = CalculatorServiceGrpc.newStub(channel);


        // Create Countdown Latch
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<FindMaximumRequest> requestStreamObserver  = asyncClient.findMaximum(new StreamObserver<FindMaximumResponse>() {
            @Override
            public void onNext(FindMaximumResponse value) {
                System.out.println("Current Maximum: " + value.getMaxResult());

            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server Has Returned all Results");
            }
        });

        Arrays.asList(3, 5, 17, 9, 8, 30, 12).forEach(
                number -> {
                    System.out.println("Client Sending: " + number);
                    requestStreamObserver.onNext(FindMaximumRequest
                            .newBuilder()
                            .setNumber(number)
                            .build());

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestStreamObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the gRPC client.");

        CalculatorClient client = new CalculatorClient();

        client.run();

    }
}
