package unit2;

import java.util.Scanner;

/**
 Description: Program to take the square root of a positive number entered by the user.
 Date: 2024-11-22
 @author Alex Reydman
*/

public class LoopChallenge2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
    double number;

    // Do-while loop to ensure a positive number is entered
    do {
      System.out.print("Please enter a positive number: ");
      number = scanner.nextDouble(); // Read the user input

      if (number < 0) {
        // If the number is negative, print a warning and ask again
        System.out.println("Warning: The number you entered is negative. Please enter a positive number.");
      }

    } while (number < 0); // Continue looping until a positive number is entered

    // Once a positive number is entered, calculate and display the square root
    double squareRoot = Math.sqrt(number);
    System.out.println("The square root of " + number + " is " + squareRoot);
    
    scanner.close(); // Close the scanner object
  }
}
