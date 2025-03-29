package unit1;
/*
 * Description: Calculating cost with taxes using outputs and code
 * 2024-10-17
 * @author Alex Reydman
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double TAX_RATE = 0.13;
        DecimalFormat money = new DecimalFormat("0.00");
        DecimalFormat percent = new DecimalFormat("#.#%");

        double cost;
        System.out.print("Please enter the cost of an item then press <Enter>: $");
        cost = sc.nextDouble();
        
        double total = cost + (cost * TAX_RATE);
        
        // Initial output without formatting
        System.out.println("The cost of your item with tax is " + total);
        
        // Uncomment to check the formatted output
        // System.out.println("The cost of your item with tax is " + money.format(total));
        
        // Change money format to "$0.00"
        money = new DecimalFormat("$0.00");
        System.out.println("The cost of your item with tax is " + money.format(total));
        
        // Change money format to "$0.##"
        money = new DecimalFormat("$0.##");
        System.out.println("The cost of your item with tax is " + money.format(total));
        
        // Calculate for a cost of 10.50
        cost = 10.50;
        total = cost + (cost * TAX_RATE);
        System.out.println("The cost of your item with tax is " + money.format(total));
        
        // Format for larger amounts
        cost = 123456;
        total = cost + (cost * TAX_RATE);
        money = new DecimalFormat("$#,###,##0.00");
        System.out.println("The cost of your item with tax is " + money.format(total));
        
        // Print tax rate
        System.out.println("The tax rate is " + TAX_RATE);
        
        // Format the TAX_RATE
        System.out.println("The tax rate is " + percent.format(TAX_RATE));

        sc.close();
    }
}
