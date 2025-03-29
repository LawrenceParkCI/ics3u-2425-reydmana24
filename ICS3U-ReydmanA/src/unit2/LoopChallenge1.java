package unit2;

/**
 * Description: A program that asks for a password and grants access 
 * only if the correct password is provided. The user has up to 3 attempts 
 * to enter the correct password.
 * 
 * Date: 2024-11-22
 * @author Alex Reydman
 */

import java.util.Scanner;

public class LoopChallenge1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Define the correct password
        String correctPassword = "secret123";
        // Set the maximum number of attempts
        int maxAttempts = 3;
        int attempts = 0;
        boolean passwordCorrect = false;
        
        // Ask for the password until the correct password is entered or attempts are exhausted
        while (attempts < maxAttempts && !passwordCorrect) {
            System.out.print("Enter the password: ");
            String userInput = in.nextLine();  // Get the password input from the user
            attempts++;  // Increment the attempt counter
            
            // Check if the entered password is correct
            if (userInput.equals(correctPassword)) {
                passwordCorrect = true;  // Correct password entered, stop the loop
                System.out.println("Welcome! You have entered the correct password.");
            } else {
                if (attempts < maxAttempts) {
                    System.out.println("Incorrect password. Try again.");
                }
            }
        }
        
        // If after 3 attempts the password was not correct
        if (!passwordCorrect) {
            System.out.println("You have reached the maximum number of attempts. Access denied.");
        }

        in.close();  // Close the scanner
    }
}
