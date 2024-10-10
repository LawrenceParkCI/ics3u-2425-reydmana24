package unit1;

import java.util.Scanner;

public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		double length, width, cost, total;
		
		//receive user input
		System.out.println("State the length of your future carpet in meters and click <Enter>");
		length = sc.nextDouble();
		
		System.out.println("State the width of your future carpet in meters and click <Enter>");
		width = sc.nextDouble();
		
		System.out.println("State the cost of your future carpet per square meter and click <Enter>");
		cost = sc.nextDouble();
		
		//print output
		System.out.println("\nThe cost of your future carpet is: " + (total = cost*length*width ) + "dollars.");
		sc.close();
		
		

	}

}