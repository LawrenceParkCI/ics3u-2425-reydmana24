package unit1;
/**
 * Description: this code prints out the calculations for 
 * Date:2024-10-09
 * @Alex Reydman
 */

import java.util.Scanner;

public class Alive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		//declare variables 
		int year1, month1, day1, year2,month2, day2, tdays;
		
		//get the user input 
		System.out.println("ALIVE");
		System.out.print("Type in the year you were born and <Enter>:");
		year1 = sc.nextInt();
		
		System.out.print("Enter the month # you were born and <Enter>:");
		month1 = sc.nextInt();
		
		System.out.print("Enter the day you were born and <Enter>:");
		day1 = sc.nextInt();
		
		System.out.print("Type in the current year and <Enter>:");
		year2 = sc.nextInt();
		
		System.out.print("Enter the current month # and <Enter>:");
		month2 = sc.nextInt();
		
		System.out.print("Enter the current day and <Enter>:");
		day2 = sc.nextInt();
		
		
		//print the output
		System.out.format("\n");
		System.out.println("Enter your birthdate:");
		System.out.println("Year: " + year1);
		System.out.println("Month: " + month1);
		System.out.println("Day: " + day1);
		System.out.println("Enter Todays date:");
		System.out.println("Year: " + year2);
		System.out.println("Month: " + month2);
		System.out.println("Day: " + day2);
		System.out.println("You have been alive for " + (tdays = ((year2 - year1)*365) + ((month2 - month1)*30) + ((day2 - day1))) + " days");
		System.out.println("you have been asleep for " + (tdays)*8);
		sc.close();


		
		
	}

}