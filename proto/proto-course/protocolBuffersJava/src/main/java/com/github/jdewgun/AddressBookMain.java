package com.github.jdewgun;
import com.example.tutorial.AddressBookProtos.AddressBook;
import com.example.tutorial.AddressBookProtos.Person;
import com.google.protobuf.util.JsonFormat;

import java.io.*;
import java.util.Arrays;


class AddressBookMain {
    // This function fills in a Person message based on user input.
    static Person addPersonToAddressBook(
            Integer id,
            String name,
            String email,
            String[] numbers,
            String[] typeOfPhones) {
        Person.Builder personVal = Person.newBuilder();

        personVal.setId(id)
                .setName(name)
                .setEmail(email);
        for (int i = 0; i < numbers.length; i++) {
            Person.PhoneNumber.Builder phoneNumberVal = Person.PhoneNumber
                    .newBuilder()
                    .setNumber(numbers[i]);
            if (typeOfPhones[i].equals("Mobile")) {
                phoneNumberVal.setType(Person.PhoneType.MOBILE);
            } else if (typeOfPhones[i].equals("Home")) {
                phoneNumberVal.setType(Person.PhoneType.HOME);
            } else if (typeOfPhones[i].equals("Work")) {
                phoneNumberVal.setType(Person.PhoneType.WORK);
            } else {
                System.out.println("Unknown phone type. Using default.");
            }

            personVal.addPhones(phoneNumberVal);
        }
        return personVal.build();
    }

    // Main function:  Reads the entire address book from a file,
    //   adds one person based on user input, then writes it back out to the same
    //   file.
    public static void main(String[] args) throws Exception {

        AddressBook.Builder addressBook = AddressBook.newBuilder();

        // Add an address.
        addressBook.addAllPeople(
                Arrays.asList(
                        addPersonToAddressBook(
                                1, "John", "john@example.com",
                                new String[]{"078634331", "078634332", "078634333"},
                                new String[]{"Mobile", "Home", "Work"}),
                        addPersonToAddressBook(2, "Jack", "jack@example.com",
                                new String[]{"078634331"}, new String[]{"Home"}),
                        addPersonToAddressBook(3, "Joe", "joe@example.com",
                                new String[]{"078634331"}, new String[]{"Work"})
                )
        );

        // Print Values As JSON
        String jsonString = JsonFormat.printer()
                .includingDefaultValueFields()
                .print(addressBook);

        System.out.println(jsonString);
        // Write to Bin File
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("user_data.bin");
            addressBook.build().writeTo(fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}