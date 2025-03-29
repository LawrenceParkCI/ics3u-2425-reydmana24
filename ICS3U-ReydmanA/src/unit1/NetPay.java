package unit1;
/**
 * Description: this code prints out the calculations for an employees net pay
 * Date:2024-10-09
 * @author Alex Reydman
 */

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		//declare variables
		int hours, wage,insurance; 
		double tax;
		
		//get the user input 
		System.out.println("Net Pay");
		System.out.print("Type in the hours your employee or you worked and <Enter>:");
		hours = sc.nextInt();
		
		System.out.print("Type in your hourly wage and <Enter>:");
		wage = sc.nextInt();
		
		System.out.print("Type in the insurance deduction and <Enter>:");
		insurance = sc.nextInt();
		
		System.out.print("Type in the tax percentage deduction and <Enter>:");
		tax = sc.nextDouble();
		
		//calculate the area
		double netpay = (hours * wage - insurance) - tax * (hours * wage - insurance);
		
		//print the output
		System.out.println("Your netpay is " + netpay);
		sc.close();


	}

}