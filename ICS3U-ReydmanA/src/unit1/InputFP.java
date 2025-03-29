package unit1;
/**
 * Description: this code prints floating point numbers
 * Date:2024-10-09
 * @author Alex Reydman
 */

import java.util.Scanner;

public class InputFP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declare variable 
		double num1, num2;
		
		//receive user input 
		System.out.println("Type in floating point number");
		num1 = sc.nextDouble();
		System.out.println("Type in another floating point number");
		num2 = sc.nextDouble();
		
		//print the output
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		sc.close();

	}

}