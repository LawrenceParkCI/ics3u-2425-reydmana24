package unit1;
/**
 * Description This program prints a bingo card with the rules. <br>
 * Date: Sept. 27, 2024
 * @author Alex Reydman
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BingoGame 
{
	public static void main(String[] args) {
		displayBingoRules();
		generateBingoCard();
	}

	public static void displayBingoRules() {
		String[] rules = {
				"1. The game is played on a 5x5 grid with 25 squares.",
				"2. Each player gets a Bingo card with random numbers.",
				"3. The objective is to mark off numbers as they are called.",
				"4. The first player to mark off a complete row, column, or diagonal wins!",
				"5. Shoutout BINGO! to win."
		};

		for (String rule : rules) {
			System.out.println(rule);
			System.out.println(); // Blank line between rules
		}
	}

	public static void generateBingoCard() {
		List<Integer> B = getUniqueRandomNumbers(1, 15, 5);
		List<Integer> I = getUniqueRandomNumbers(16, 30, 5);
		List<Integer> N = getUniqueRandomNumbers(31, 45, 4);
		N.add(2, 0); // Adding FREE space at index 2
		List<Integer> G = getUniqueRandomNumbers(46, 60, 5);
		List<Integer> O = getUniqueRandomNumbers(61, 75, 5);

		System.out.println("\nBingo Card:");
		System.out.println("\n");
		System.out.println(" B   I   N   G   O");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%-3d %-3d %-5s %-3d %-3d%n", B.get(i), I.get(i), (i == 2 ? "FREE" : N.get(i)), G.get(i), O.get(i));
		}
	}

	public static List<Integer> getUniqueRandomNumbers(int start, int end, int count) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		return numbers.subList(0, count);
	}
}
