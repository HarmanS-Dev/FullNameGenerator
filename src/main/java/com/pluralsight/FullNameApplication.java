package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        System.out.print("First name: ");
        String nameFirst = input.nextLine().trim();
        System.out.print("Middle name: ");
        String nameMiddle = input.nextLine().trim();
        System.out.print("Last name: ");
        String nameLast = input.nextLine().trim();
        System.out.print("Suffix: ");
        String nameSuffix = input.nextLine().trim();

        String nameFull = nameFirst;
        if (!nameMiddle.isEmpty()){
            nameFull += " " + nameMiddle + ".";
        }

        nameFull += " " + nameLast;

        if (!nameSuffix.isEmpty()){
            nameFull += ", " + nameSuffix;
        }

        System.out.println("Full name: " + nameFull);
    }
}
