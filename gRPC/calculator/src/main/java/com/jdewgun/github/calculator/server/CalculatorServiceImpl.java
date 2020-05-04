package com.jdewgun.github.calculator.server;

import com.jdewgun.github.proto.calculator.*;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        // Create the Response to be sent, that is, the sum function
        SumResponse sumResponse = SumResponse.newBuilder()
                .setSumResult(
                        request.getFirstNumber() + request.getSecondNumber()
                ).build();

        // Send back the response.
        responseObserver.onNext(sumResponse);

        // Complete the transaction.
        responseObserver.onCompleted();
    }

    @Override
    public void primeNumberDecomposition(PrimeNumberDecomposeRequest request, StreamObserver<PrimeNumberDecomposeResponse> responseObserver) {
        int numberToDecompose = request.getNumberToDecompose();
        int divisor = 2;

        while (numberToDecompose > 1) {
            if (numberToDecompose % divisor == 0) {
                numberToDecompose = numberToDecompose/divisor;
                responseObserver.onNext(PrimeNumberDecomposeResponse.newBuilder().setDecompositionResult(divisor).build());
                try {
                    Thread.sleep(2000); // 2 second pause between each result
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                divisor += 1;
            }
        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ComputeAverageRequest> computeAverage(StreamObserver<ComputeAverageResponse> responseObserver) {

        StreamObserver<ComputeAverageRequest> requestObserver = new StreamObserver<ComputeAverageRequest>() {
            // running sum and count
            int count = 0;
            int sum = 0;


            @Override
            public void onNext(ComputeAverageRequest value) {
                // increment the sum
                sum += value.getNumber();
                count += 1;
            }

            @Override
            public void onError(Throwable t) {
                // client sends error
            }

            @Override
            public void onCompleted() {
                float average = (float) sum/count;
                responseObserver.onNext(
                        ComputeAverageResponse
                                .newBuilder()
                                .setAvgResult(average)
                                .build()
                );
                responseObserver.onCompleted();
            }
        };
        return requestObserver;
    }


    @Override
    public StreamObserver<FindMaximumRequest> findMaximum(StreamObserver<FindMaximumResponse> responseObserver) {

        return new StreamObserver<FindMaximumRequest>() {

            int currentMaximum = 0;
            @Override
            public void onNext(FindMaximumRequest value) {
                int currentInput = value.getNumber();
                if (currentInput > currentMaximum) {
                    currentMaximum = currentInput;
                    responseObserver.onNext(
                            FindMaximumResponse
                                    .newBuilder()
                                    .setMaxResult(currentMaximum)
                                    .build()
                    );
                }
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(
                        FindMaximumResponse
                                .newBuilder()
                                .setMaxResult(currentMaximum)
                                .build()
                );

                responseObserver.onCompleted();
            }
        } ;
    }
}
