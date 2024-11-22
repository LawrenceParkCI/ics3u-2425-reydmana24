package unit1;

import java.util.Scanner;

/**
 * Description:
 * Date: 2024-10-11
 * @Alex Reydman
 */
public class Casting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		//The type of data being printed is Double. doubleNum is declared as a double type variable. Therefore, it can store decimal numbers.
		System.out.println(doubleNum);

		//can you explain what is happening in this code?
		//This line updates doubleNum by adding 2.2 to its current value. 
		//After performing the code, doubleNum will now be 12.2.
		doubleNum = doubleNum + 2.2;

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		//The data type printed here is int.
		//The data type printed is int because intNum is declared as an integer and holds the value 12.
		System.out.println(intNum);

		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double
      - Implicit data
      double to int
      - Explicit
      int to long
      - Implicit
      long to int
      - Explicit

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    Implicit Casting is used when converting to a larger or more accommodating data type that can safely hold the value of the smaller type without losing any information.
	Explicit Casting is required when there’s a risk of losing information or when converting from a larger type to a smaller type.
		 */




		System.out.println("Part 2");

		// Understanding what you can do with casting, can you round the following variable to the nearest 10th?
		double myNum;

		Scanner in = new Scanner(System.in);
		System.out.println("Give me a decimal number up to the hundredth:");
		myNum = in.nextDouble(); // Read the user input

		// Rounding to the nearest tenth
		myNum = Math.round(myNum * 10.0) / 10.0;

		System.out.print("Rounding down to the nearest tenth, it is: " + myNum);

		in.close(); 
	}

}