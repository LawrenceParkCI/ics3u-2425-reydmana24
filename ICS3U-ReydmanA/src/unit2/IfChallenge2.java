package unit2;

import java.util.Scanner;

/**
 * Description: A program that checks if three numbers are strictly in order.
 * Date: 2024-11-11
 * @author Alex Reydman
 */

public class IfChallenge2 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Check if the numbers are in order
        if (num1 < num2 && num2 < num3) {
            System.out.println("The numbers are strictly in order.");
        } else {
            System.out.println("The numbers are not strictly in order.");
        }

        
        scanner.close();
    }
}
