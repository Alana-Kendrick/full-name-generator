package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine();

        // placeholder for the print statement that will print the full name
        System.out.println(firstName);

        scanner.close();
    }
}
