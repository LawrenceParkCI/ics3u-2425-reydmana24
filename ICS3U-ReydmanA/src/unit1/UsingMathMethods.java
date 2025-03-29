package unit1;
/*
 * Description: Using code to to math problems
 * Date: 2024-10-10]
 * @Alex Reydman
 */
import java.util.Scanner;

public class UsingMathMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Part A");

		// Asking the user for a real number
		System.out.print("Please enter a real number: ");
		num = sc.nextDouble();

		System.out.println("Math.round(num) = " + Math.round(num));
		System.out.println("Math.rint(num) = " + Math.rint(num));
		System.out.println("Math.sqrt(num) = " + Math.sqrt(num));
		System.out.println("Math.abs(num) = " + Math.abs(num));
		System.out.println("Math.pow(num, 2) = " + Math.pow(num, 2));
		System.out.println("Math.pow(num, num) = " + Math.pow(num, num));
		System.out.println("Math.pow(num, 3) = " + Math.pow(num, 3));

		/*
		 * After running the program, fill in the output for the following inputs:
		 * 
		 * num = 16.75		| num = 4.0		| num = -23.45
		 * --------------------------------------------------------
		 * Math.round(num)   | 17             | 4              | -23
		 * Math.rint(num)    | 17.0           | 4.0            | -23.0
		 * Math.sqrt(num)    | 4.093          | 2              | NaN
		 * Math.abs(num)     | 16.75          | 4              | 23.45
		 * Math.pow(num, 2)  | 280.5625       | 16             | 552.9025
		 * Math.pow(num, num)| 500217.05119...| 256           | NaN
		 * Math.pow(num, 3)  |  2959.0625     | 64             | -1220.709125
		 */

		// Why does the last value (-23.45) give strange output for Math.sqrt(num)?
		// Nan stands for Not a number! This is because the square root of a negative number is not defined in the set of real numbers.

		// In your own words describe what the following Math methods does
		/*
		 * round: Rounds a floating-point number to the nearest integer.
		 * rint: Returns the double value that is closest to the argument and is equal to a mathematical integer.
		 * sqrt: Returns the square root of a number.
		 * abs: Returns the absolute value of a number.
		 * pow: Raises a number to the power of another number.
		 */

		// The methods round, sqrt, and abs only have one parameter. Why does the pow method have 2 parameters?
		// The pow method requires two parameters: the base (the number to be raised) and the exponent (the power to raise it to).

		System.out.println("Part B");
		// Ask the user for a real number and an integer
		System.out.print("Please enter a real number: ");
		double realNum = sc.nextDouble();
		System.out.print("Please enter an integer: ");
		int power = sc.nextInt();

		double sqrt = Math.sqrt(realNum);
		double raisedToPower = Math.pow(realNum, power);

		System.out.printf("REAL NUMBER\tSQUARE ROOT\tRAISED TO POWER %d%n", power);
		System.out.printf("%10.4f\t%10.4f\t%10.4f%n", realNum, sqrt, raisedToPower);

		// Results for real number 7.8985 and integer 3
		// Output should be:
		// REAL NUMBER      SQUARE ROOT       RAISED TO POWER 3
		//      7.8985         2.8101              615.0364

		// Change to accept a real number power
		System.out.print("Please enter a real number for power: ");
		double realPower = sc.nextDouble();
		double raisedToRealPower = Math.pow(realNum, realPower);
		System.out.printf("REAL NUMBER\tSQUARE ROOT\tRAISED TO POWER %.2f%n", realPower);
		System.out.printf("%10.4f\t%10.4f\t%10.4f%n", realNum, sqrt, raisedToRealPower);

		// a) Input: 16 and 0.5
		// Expected output: 16.0  4.0  4.0
		// b) Input: 8 and 0.33
		// Expected output: 8.0  2.8284  2.0 (approximately)

		// Does the program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		// The output will be slightly different due to the precision of floating-point representation.

		sc.close();
	}
}
