package com.github.jdewgun;

import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

        // Setting the fields
        builder.setId(1)
                .setIsSimple(true)
                .setName("Simple Proto Java Message")
                .addAllSampleList(Arrays.asList(4,5,6));

        System.out.println(builder.toString());

        SimpleMessage message = builder.build();

        // Write Protocol Buffers binary to a file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("simpleMessage.bin");
            message.writeTo(fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Reading from Binary File: ");
            FileInputStream fileInputStream = new FileInputStream("simpleMessage.bin");
            SimpleMessage messageFromFile = SimpleMessage.parseFrom(fileInputStream);
            System.out.println(messageFromFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
