package unit2;



import java.util.Scanner;

/**
 * Description: If challenge class.
 * Date: 2024-11-11
 * @author Alex Reydman
 */

public class IfChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Ask for the user's favourite number
        System.out.print("Please enter your favorite number: ");
        int favoriteNumber = in.nextInt();

        // Check if the number is negative
        if (favoriteNumber < 0) {
            System.out.println("You need to look on the bright side.");
        }

        // Check if the number is odd
        if (favoriteNumber % 2 != 0) {
            System.out.println("That's a bit strange.");
        }

        // Check if the number is divisible by both 2 and 3
        if (favoriteNumber % 2 == 0 && favoriteNumber % 3 == 0) {
            System.out.println("You should really consider thinking about 6.");
        } else {
            System.out.println("You can keep wholesome.");
        }

        // Check the ones digit of the number
        int onesDigit = favoriteNumber % 10;
        if (onesDigit == 8) {
            System.out.println("I too am full.");
        } else if (onesDigit == 9) {
            System.out.println("Canada is a nice country.");
        } else {
            System.out.println("Don't count on it.");
        }

        in.close(); 
    }
}
