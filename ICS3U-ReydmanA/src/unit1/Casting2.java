package unit1;

/**
 * Description: This demonstrates type casting between char and int, showing implicit and explicit casting.
 * Date: 2024-10-10
 * @Alex Reydman
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		System.out.println(myChar + 1);

		char myChar2 = (char) (myChar + 1);

		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
		//The code starts by defining "mychar" as "a". When the number 1 is added to mychar, java reads it as a number, resulting in 98. Then to convert it back to letters the code uses a new variable mychar2 as a letter "b".  

		//Why do you think this happens?
		//Because Java uses numeric values (ASCII) to represent characters. When you add to a character, it converts to a number. You then will need explicit casting to turn the number back into a character after.

		//Investigate what is ASCII. What is it?
		//ASCII (American Standard Code for Information Interchange) is a character encoding standard that assigns numeric values (0-127) to characters, including letters, digits, and symbols. 
		//Can you find the number value for 'a'? Does it match with your findings above?
		//Yes the value for 'a' in ASCII is '97'. It does match my findings above

		//create a new character myCharCap, and transform myChar into a capital 'A' and print it

		char myChar1 = 'a';

		System.out.println((char)(myChar1 - 32));


	}
}