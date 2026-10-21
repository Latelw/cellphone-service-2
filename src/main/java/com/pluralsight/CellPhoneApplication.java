package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        Scanner scanner = new Scanner(System.in);
        //Ask the 5 questions, Set answers  with Setters

        System.out.println("===Phone===");

        System.out.print("What is the serial number? ");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("What model is the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.nextLine());
        System.out.println("\n");

        // Print with Getters
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("\n");


        //New Phone and values
        System.out.println("===NEW PHONE===");
        CellPhone phone1 = new CellPhone();
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        phone1.setSerialNumber(Integer.parseInt(scanner1.nextLine()));


        System.out.print("What model is the phone? ");
        phone1.setModel(scanner1.nextLine());

        System.out.print("Who is the carrier? ");
        phone1.setCarrier(scanner1.nextLine());

        System.out.print("What is the phone number? ");
        phone1.setPhoneNumber(scanner1.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone1.setOwner(scanner1.nextLine());
        System.out.println("\n");

        System.out.println("Serial number: " + phone1.getSerialNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Carrier: " + phone1.getCarrier());
        System.out.println("Phone number: " + phone1.getPhoneNumber());
        System.out.println("Owner: " + phone1.getOwner());

        phone1.dial("321-513-2378");

        //Call Display for both phones
        System.out.println("===Show Display== \n");

        display(phone);
        display(phone1);



    } //Add display for phone

    public static void display(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Carrier: " + phone.getCarrier());


    }
}