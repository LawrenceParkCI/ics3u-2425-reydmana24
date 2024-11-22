package unit2;

/**
Description:
Date:
@author Alex Reydman
 */

/*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.

    Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
 */

//Can you create it such that you can remove some breaks?
import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Ask for the month and year
		System.out.print("Enter the month: ");
		String month = scanner.nextLine().trim();
		System.out.print("Enter the year: ");
		int year = scanner.nextInt();

		// Determine if the year is a leap year
		boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

		int days = 0;

		// Use switch statement to determine the number of days in the month
		switch (month.toLowerCase()) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december":
			days = 31; // 31 days in these months
			break;
		case "april":
		case "june":
		case "september":
		case "november":
			days = 30; // 30 days in these months
			break;
		case "february":
			days = isLeapYear ? 29 : 28; // Leap year logic for February
			break;
		default:
			System.out.println("Invalid month entered.");
			return; // Exit if invalid month
		}

		// Output the result
		System.out.println("The month of " + month + " in the year " + year + " has " + days + " days.");

	}
}
