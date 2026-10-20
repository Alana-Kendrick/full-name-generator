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
            fullName = firstName.trim() + " " + lastName.trim() + ", " + suffix.trim();
        } else if (suffix.isEmpty()) {
            fullName = firstName.trim() + " " + middleName.trim() + " " + lastName.trim();
        } else if (middleName.isEmpty() && suffix.isEmpty()) {
            fullName = firstName.trim() + " " + lastName.trim();
        } else {
            fullName = firstName.trim() + " " + middleName.trim() + " " + lastName.trim() + ", " + suffix.trim();
        }

        System.out.println(fullName);

        scanner.close();
    }
}
