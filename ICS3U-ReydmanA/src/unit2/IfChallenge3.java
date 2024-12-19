package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date: 2024-11-13
 * @author Alex Reydman
 */


//This is for the portfolio

/*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
 */


public class IfChallenge3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask the user if they're ready
		System.out.println("Are you ready for a quiz? (Yes/No)");
		String response = scanner.nextLine();

		// If the answer is "No", exit the quiz
		if (response.equalsIgnoreCase("No")) {
			System.out.println("Okay, maybe next time!");
			return;
		}

		// Start the quiz
		System.out.println("Okay, here it comes!\n");

		// Define questions and correct answers
		String[] questions = {
				"What is the capital of China? \n1) Taiwann \n2) Shanghai \n3) Beijing",
				"Is the Earth flat? (True/False)",
				"What is the largest ocean on Earth? \n1) Atlantic Ocean \n2) Indian Ocean \n3) Pacific Ocean"
		};

		String[] correctAnswers = {"3", "False", "3"};
		int score = 0;

		// Loop through the questions
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			String answer = scanner.nextLine();

			// Check if the answer is correct
			if (answer.equalsIgnoreCase(correctAnswers[i])) {
				System.out.println("That's correct!\n");
				score++;
			} else {
				System.out.println("That's wrong. The correct answer was: " + correctAnswers[i] + "\n");
			}
		}

		// Print the final score out of 3
		System.out.println("Your final score is: " + score + " out of " + questions.length);
	}
}

