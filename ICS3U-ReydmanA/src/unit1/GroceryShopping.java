package unit1;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Description: This class prints a conversation asking what is being bought and the qauntity. Then printing a receipt, with tax included.
 * Date: 2024-10-18
 * @author Alex Reydman
 */
import java.util.Scanner;
public class GroceryShopping {
	public static void main(String[] args) {
		// Constants
		final double TAX_RATE = 0.13;
		String[] products = new String[2];
		double[] costs = new double[2];
		int[] quantities = new int[2];
		double subtotal = 0.0;

		// Title
		System.out.println(" $$$  ========== \"Alex's Fresh Food Market\" ========== /// $$$ ||");

		Scanner scanner = new Scanner(System.in);

		// Input for two products
		for (int i = 0; i < 2; i++) {
			System.out.print("What would you like to buy? ");
			products[i] = scanner.nextLine();
			System.out.print("How much does it cost? ");
			costs[i] = scanner.nextDouble();
			System.out.print("How many are you buying? ");
			quantities[i] = scanner.nextInt();
			scanner.nextLine();  
			System.out.println("Very good.");
		}

		// Print receipt
		System.out.println("\nThis is your receipt:\n");
		System.out.println("          Alex's Fresh Food Market");
		System.out.println(new SimpleDateFormat("MM/dd/yy HH:mm").format(new Date()) + "\n");
		System.out.printf("Item      |  Price  | Quant. | Total Price \n");
		System.out.println("------------------------------------------");

		for (int i = 0; i < products.length; i++) {
			double totalPrice = costs[i] * quantities[i];
			subtotal += totalPrice;
			System.out.printf("%-10s | $ %5.2f | %6d  | $ %10.2f%n", products[i], costs[i], quantities[i], totalPrice);
		}

		// Calculating tax and total
		double tax = subtotal * TAX_RATE;
		double total = subtotal + tax;

		System.out.println("------------------------------------------");
		System.out.printf("%24s Subtotal: $ %9.2f%n", "", subtotal);
		System.out.printf("%24s Tax:      $ %9.2f%n", "", tax);
		System.out.printf("%24s Total:    $ %9.2f%n%n", "", total);


		int approximateDollarValue = (int) Math.round(total);
		System.out.printf("This is approximately $%d.%n", approximateDollarValue);



		System.out.println("\nHave a good day!");
		System.out.println("Thank you for shopping at Alex's Fresh Food Market!");

		scanner.close();
	}
}
