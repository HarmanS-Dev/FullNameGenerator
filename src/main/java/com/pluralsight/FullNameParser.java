package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Please enter your full name: ");
      String nameFull = input.nextLine();

      String[] nameSplit = nameFull.split(" ");

      if (nameSplit.length == 2) {
          System.out.println("First name: " + nameSplit[0]);
          System.out.println("Last name: " + nameSplit[1]);
      }
      if (nameSplit.length == 3){
          System.out.println("First name: " + nameSplit[0]);
          System.out.println("Middle name: " + nameSplit[1]);
          System.out.println("Last name: " + nameSplit[2]);
      }
    }
}
