package com.iitu.kz;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Facade facade = new Facade();

        System.out.println("To start fill the blank below");
        System.out.println("Enter your first name:");
        String firstName = in.next();
        System.out.println("Enter your last name:");
        String lastName = in.next();
        System.out.println("Enter your email:");
        String email = in.next();
        facade.startProcess(firstName, lastName, email);
    }
}
