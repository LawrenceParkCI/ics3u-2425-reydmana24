package unit2;

/**
 * Description: This program demonstrates the use of a do-while loop.
 * The program repeatedly asks for a user's name until the user enters "Mr. Lee".
 * Once that happens, the user is granted access to a secret club.
 * 
 * Date: 2024-11-21
 * @author Alex Reydman
 */

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        A loop is a control structure that allows for repetition.
        It doesn't make a decision like a conditional; rather, it checks whether it should repeat a certain block of code.
        In this case, we are using a do-while loop.
        */

        Scanner in = new Scanner(System.in);
        String name;

        // Start of the do-while loop
        do {
            System.out.print("What is your name? ");
            name = in.nextLine();
        } while (!name.equals("Mr. Lee"));  // Condition to repeat the loop

        // Once the correct name is entered, print the welcome message
        System.out.println("You are welcome into the secret secret pogchamp club.");

        in.close();  // Close the scanner

        // Run the code and explain in your own words:
        // 1. The code inside the do block is repeated until the user enters the name "Mr. Lee".
        // 2. The loop keeps asking for the name until the condition is met (i.e., the name is "Mr. Lee").
        // 3. The condition for repeating is: the name entered must NOT be "Mr. Lee".
        
        /*
         * To create a loop, consider:
         * 1. What commands need to be repeated?
         * 2. Under what conditions (when/how many times) will the loop stop repeating?
         */

        // Create a do-while loop that asks for a word and prints it 20 times
        String word;
        int count = 0;

        // Another do-while loop that prints the entered word 20 times
        do {
            System.out.print("Enter a word: ");
            word = in.nextLine();
            count++;  // Increase the count each time the word is printed
            System.out.println(word);  // Print the word
        } while (count < 20);  // Continue repeating until the word has been printed 20 times
    }
}
