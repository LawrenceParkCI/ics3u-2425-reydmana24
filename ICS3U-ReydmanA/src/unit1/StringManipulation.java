
package unit1;
/**
 * Description: this code prints and analyzes the sentence inputed.
 * Date: 2024-10-09
 * @author Alex Reydman
 */
import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		String sentence;
		
		//Receive user input
		System.out.println("Type in a sentence");
		sentence = sc.nextLine();
		
		//print output
		System.out.println("\nThe following has been printed");
		System.out.println("\n" + sentence);
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		System.out.println("The sentence is " + sentence.length() + " characters long");
		System.out.println("At index 5, the character displayed is: " + sentence.charAt(5));
		sc.close();
		
		//BONUS
		 // Output just the first word of the String
		String firstWord = sentence.split(" ")[0];
		System.out.println("The first word is: " + firstWord);
			       
		// Output just the last word of the String
		String lastWord = sentence.split(" ")[sentence.split(" ").length - 1];
		System.out.println("The last word is: " + lastWord);
		
		

	}

}
