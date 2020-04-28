package com.github.jdewgun;

import example.complex.Complex.*;

import java.util.Arrays;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("Complex Message: ");

        DummyMessage oneDummy = buildNewDummyMessage(55, "one dummy message");

        ComplexMessage.Builder builder = ComplexMessage.newBuilder();

        // Singular Field Addition
        builder.setOneDummy(oneDummy);

        // Repeated Field Addition
        builder.addMultipleDummy(buildNewDummyMessage(60, "second dummy message"));
        builder.addMultipleDummy(buildNewDummyMessage(61, "third dummy message"));
        builder.addMultipleDummy(buildNewDummyMessage(62, "fourth dummy message"));

        // Repeated Field Addition: More Quicker Way
        builder.addAllMultipleDummy(Arrays.asList(
                buildNewDummyMessage(63, "other dummy message"),
                buildNewDummyMessage(64, "otherOther dummy message")
        ));

        ComplexMessage complexMessage = builder.build();

        System.out.println(complexMessage.toString());


    }

    public static DummyMessage buildNewDummyMessage(Integer id, String name) {
        DummyMessage.Builder dummyMessageBuilder = DummyMessage.newBuilder();
        DummyMessage message = dummyMessageBuilder.setId(id)
                .setName(name)
                .build();

        return message;
    }
}
