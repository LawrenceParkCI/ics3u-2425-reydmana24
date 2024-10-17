package unit1;

/**
 * Description: More casting practice
 * Date: 2024-10-17
 * @author Alex Reydman
 */
public class Casting3 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/* 
		 * Strings and Back Again
		 */
		//Recall:
		System.out.println("Part 1");
		System.out.println("1 + 2 + 3" + 4 + 5);
		//why did it print out this way?

		// it has printed this way because, it printed the characters in the quotes
		// For the code on the exterior of the quotations, it removed whitespace and symbols

		//Demonstrate casting a double value to a String in this way

		System.out.println("AlexReydman" + 5.0);

		//Demonstrate casting a boolean value to a String in this way
		
		System.out.println("AlexReydman" + true);
		
		//Demonstrate casting a char value to a String in this way

		System.out.println("AlexReydman" + 'a');
		
		System.out.println("\nPart 2");
		//In order to change a String into an integer, we need another set of code

		String strNum = "25";
		int myNum = Integer.parseInt(strNum);

		System.out.println(strNum + " x 2 = " + (myNum + myNum));

		/*Change strNum to the following values, and see if they work:
		 * "25.2" - doesnt work
		 * "23c" - doesnt work
		 * "2 3" - doesnt work
		 * "Lol23" - doesnt work
		 * "-5" - works
		 */
		//What can you say about how we can use the function, Integer.parseInt()?

		//The function only works if the variable strNum is an integer

		//What do you think the code to change a String to double would look like?
		//Similarly, test out the code and write down what instructions

		String strNum2 = "-10.0";
		double myNum2 = Double.parseDouble(strNum2);
		System.out.println(myNum2 + " x 2 = " + (myNum2 + myNum2));
		
		//When do you think it might be necessary to change a string value into an integer value/double value?
		
		//it might be necessary to change a string value into an integer/double value when you have to do calculations for math problems, with the string.
		
	}
}