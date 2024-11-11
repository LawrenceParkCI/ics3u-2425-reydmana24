package unit1;

import java.text.NumberFormat;
import java.util.Scanner;
/**
 * Description: NF Output class
 * Date: Oct 27, 2024
 * @author Alex Reydman
 */
public class NFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		//How can you change how your value is displayed?
		
		// A different NumberFormat code can be used
		
		//What other formats does NumberFormat offer?
		
		/* Other formats does NumberFormat offer are:
		 * NumberFormat.getDecimalInstance();
		 * NumberFormat.getIntegerInstance
		 * NumberFormat.getUnitInstance();
		 * NumberFormat.getCompactNumberInstance();
		 
		 */
		

		sc.close();
	}

}