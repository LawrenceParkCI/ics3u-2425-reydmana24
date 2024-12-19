package unit2;

/**
 * Description: This program uses a while loop to repeatedly ask for people's names 
 * and prints a welcome message for each person. The loop runs a number of times 
 * based on how many people the user is planning to see.
 * 
 * Date: 2024-11-22
 * @author Alex Reydman
 */

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many people are you planning to see?");
        
        // The user is asked how many people they are planning to see
        // The input is read and converted from String to Integer
        int numPeople = Integer.parseInt(in.nextLine());
        
        // The while loop runs as long as there are people to see
        while (numPeople > 0) {
            System.out.print("What is this person's name? ");
            
            // The variable 'name' is declared inside the loop 
            // to capture the name of each person for each iteration
            String name = in.nextLine();
            System.out.println("Welcome, " + name + "!");
            
            // Decrease the number of people left to see by 1
            numPeople = numPeople - 1;
        }
        
        in.close();  // Close the scanner

        // Run the code using the debugger to better understand how it executes.
        
        // Code explanation:
        // 1. The code inside the `while` loop is repeated as long as the number of people is greater than 0.
        // 2. After asking for a name and printing a welcome message, the number of people left to see is decremented by 1.
        // 3. The loop continues until `numPeople` becomes 0.
        
        // What code is repeated?
        // The code inside the `while` loop (asking for a name and printing a welcome message) is repeated.

        // When does it decide whether to repeat or not?
        // After each iteration of the loop, the condition `numPeople > 0` is checked.

        // What is the condition for repeating?
        // The condition for repeating is that `numPeople` must be greater than 0. Once `numPeople` is 0, the loop stops.

        // What is the difference between a while loop and a do-while loop?
        // In a `while` loop, the condition is checked before the loop executes, so the code inside the loop may not run at all if the condition is false initially.
        // In a `do-while` loop, the code inside the loop runs at least once before the condition is checked.
        
        // Create a while loop that asks for a word, 
        // and prints it out 20 times.
        
        String word;
        int count = 0;

        // Create a while loop to ask for a word and print it 20 times
        while (count < 20) {
            System.out.print("Enter a word: ");
            word = in.nextLine();  // Get a word from the user
            System.out.println(word);  // Print the word
            count++;  // Increment the count after each word is printed
        }
    }
}
