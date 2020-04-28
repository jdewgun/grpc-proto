package com.github.jdewgun;

import example.enumerations.EnumMessageOuterClass;
import example.enumerations.EnumMessageOuterClass.EnumMessage;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println("Example for Enumerations: ");

        EnumMessage.Builder enumBuilder = EnumMessage.newBuilder();

        enumBuilder.setId(1)
                .setDayOfWeek(EnumMessageOuterClass.DayOfWeek.FRIDAY);

        EnumMessage message = enumBuilder.build();

        System.out.println(message);
    }
}
