package unit2;

import java.util.Scanner;

/**
 * Description: StringComparision work sheet
 * Date: Nov. 10, 2024
 * @author Alex Reydman
 */

public class StringComparison {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}
	
	}

}
	//Run the code. What happens when you type the correct answer? The incorrect answer?
	//Prints the opposite, if its correct, it prints the incorrect 

	/*
      Strings are objects not primitives and as such are a 
	 *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
        import java.util.Scanner;

/**
	 * Description: StringComparison work sheet
	 * Date: Nov. 10, 2024
	 * @author Alex Reydman
	 */

	/*class StringComparison {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String answer;

        System.out.println("What is the capital of Ontario?");
        answer = in.nextLine();

        // Using equals() for string comparison instead of ==
        if (answer.equals("Toronto")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, that's incorrect.");
        }

        // Demonstrate the use of compareTo()
        System.out.println("\nDemonstrating compareTo():");
        String answer2 = "toronto"; // Let's use a different case for comparison
        int result = answer.compareTo(answer2);
        if (result == 0) {
            System.out.println("The strings are equal.");
        } else if (result < 0) {
            System.out.println("The first string is lexicographically smaller than the second.");
        } else {
            System.out.println("The first string is lexicographically greater than the second.");
        }

        // Demonstrating equalsIgnoreCase()
        System.out.println("\nDemonstrating equalsIgnoreCase():");
        if (answer.equalsIgnoreCase(answer2)) {
            System.out.println("The strings are equal ignoring case.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // Closing the scanner
        in.close();
	 */



	


	//What values does compareTo() return?  added a demonstration of the compareTo() method to show how string comparison works lexicographically. This will allow you to compare strings in terms of alphabetical order.


	//what value does equals() and equalsIgnoreCase() return? The comparison between strings now uses equals() instead of == to properly check if the contents of the strings are equal.
	//What is the difference between these two functions?

