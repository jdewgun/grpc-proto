package com.github.jdewgun;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.Simple;

import java.util.Arrays;

public class ProtoToJSONMain {
    public static void main(String[] args) {
        Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();

        // Setting the fields
        builder.setId(1)
                .setIsSimple(true)
                .setName("Simple Proto Java Message")
                .addAllSampleList(Arrays.asList(4,5,6));

        // Print as JSON
        try {
            String jsonString = JsonFormat.printer()
                    .includingDefaultValueFields()
                    .print(builder);
            System.out.println(jsonString);

            Simple.SimpleMessage.Builder builderTwo = Simple.SimpleMessage.newBuilder();
            // Parse JSON as Protobuf
            JsonFormat.parser()
                    .ignoringUnknownFields()
                    .merge(jsonString, builderTwo);

            System.out.println(builderTwo.toString());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }




    }
}
