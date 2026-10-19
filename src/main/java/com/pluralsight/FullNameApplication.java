package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine();
        
        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName + " " + suffix;
        } else if (suffix.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName;
        } else if (middleName.isEmpty() && suffix.isEmpty()) {
            fullName = firstName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        }

        System.out.println(fullName);

        scanner.close();
    }
}
