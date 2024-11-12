package unit2;

import java.util.Scanner;

/**
Description:
Date: 2024-11-11
@author Alex Reydman
 */

public class Switch1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What number day is it?");
		int day = in.nextInt();

		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("We don't have that day yet");
			break;
		}

		//Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result? The result of a number bigger than 1-7 is printed as "we don't have that day yet" because there is only 7 days in a week.
		//What do you think default means? The default case is executed when no other case matches. It's a safety net for invalid input or unexpected conditions.
		//What do you think break means? What happens when you remove a break? : The break statement is used to exit the switch block once a match is found. Without it, the program would "fall through" to the next case.


		//Create another program, this time asking what day it is (String), and printing out how many days until the weekend

		/**
		 * Description: A program to calculate how many days until the weekend from user input.
		 * Date: 2024-11-11
		 * @author Alex Reydman
		 */
		/**public class DaysUntilWeekend {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("What day is it?");
            String day = in.nextLine().trim().toLowerCase();  // convert to lowercase for easier comparison

            switch(day) {
                case "sunday":
                    System.out.println("The weekend is today!");
                    break;
                case "monday":
                    System.out.println("5 days until the weekend.");
                    break;
                case "tuesday":
                    System.out.println("4 days until the weekend.");
                    break;
                case "wednesday":
                    System.out.println("3 days until the weekend.");
                    break;
                case "thursday":
                    System.out.println("2 days until the weekend.");
                    break;
                case "friday":
                    System.out.println("1 day until the weekend.");
                    break;
                case "saturday":
                    System.out.println("The weekend is today!");
                    break;
                default:
                    System.out.println("Invalid day entered.");
                    break;
		 */
	}




}
