import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to throw some dice? (Yes or No)");
		String playChoice = input.nextLine();

		// diceRollChoice controls status of game
		boolean diceRollChoice = startGame(playChoice);

		// getGameStatus takes user input and rolls the dice
		getGameStatus(input, diceRollChoice); // end of diceRollChoice while

		System.out.println("This has been a VH Dice Game.\n Try harder next time!");
	}

	// startGame starts the game if user agrees
	private static boolean startGame(String playChoice) {
		boolean diceRollChoice = true;

		// if loop to determine to play
		if (playChoice.equalsIgnoreCase("yes")) {
			System.out.println("Great!");
			diceRollChoice = true;
		} else if (playChoice.equalsIgnoreCase("no")) {
			System.out.println("Seriously, I worked hard on this!");
			diceRollChoice = false;
		} else {
			System.out.println("Please try again!");
			diceRollChoice = false;
		}
		return diceRollChoice;
	}

	// getGameStatus asks user for input then proceeds accordingly
	private static void getGameStatus(Scanner input, boolean diceRollChoice) {
		int diceThrow = 1;
		// System.out.println("Which set of dice would you like to roll?\n
		// Choose D6, D8, D10, D12, D20");
		while (diceRollChoice) {
			System.out.println("Which set of dice would you like to roll?\n Choose based on number of dice and side");
			System.out.println("Example: 1d4, 1d8, 1d10, 2d20, 2d12, 2d6, etc");

			String diceChoice = input.next();

			// use if else to send user to whatever case I want them to be in
			// based on dice choice
			if (diceChoice.equalsIgnoreCase("1D6")) {
				diceThrow = 6;

			} else if (diceChoice.equalsIgnoreCase("1d4")) {
				diceThrow = 4;

			} else if (diceChoice.equalsIgnoreCase("1d8")) {
				diceThrow = 8;
			} else if (diceChoice.equalsIgnoreCase("1d10")) {
				diceThrow = 10;
			} else if (diceChoice.equalsIgnoreCase("1d12")) {
				diceThrow = 12;
			} else if (diceChoice.equalsIgnoreCase("1d20")) {
				diceThrow = 20;
			} else if (diceChoice.equalsIgnoreCase("2d4")) {
				diceThrow = 24;
			} else if (diceChoice.equalsIgnoreCase("2d6")) {
				diceThrow = 26;
			} else if (diceChoice.equalsIgnoreCase("2d8")) {
				diceThrow = 28;
			} else if (diceChoice.equalsIgnoreCase("2d10")) {
				diceThrow = 210;
			} else if (diceChoice.equalsIgnoreCase("2d12")) {
				diceThrow = 212;
			} else if (diceChoice.equalsIgnoreCase("2d20")) {
				diceThrow = 220;
			} else {
				System.out.println("Invalid dice choice!");
				diceThrow = 0;
			}

			// Switch will control which dice roll we throw.... int diceThrow
			// will control switch
			// D6 = 6, D8=8, D10=10, D12=12, D20=20, Add validation to catch
			// other entries

			switch (diceThrow) {

			case 0: // default case used to reloop maybe?????

				break;
			case 4: // 1d4
				System.out.println(getDiceRoll(4));
				break;
			case 6: // d6 status
				System.out.println(getDiceRoll(6));
				break;
			case 8: // d8 status
				System.out.println(getDiceRoll(8));
				break;
			case 10: // d10 status
				System.out.println(getDiceRoll(10));
				break;
			case 12: // d12 status
				System.out.println(getDiceRoll(12));
			case 20: /// d20 status
				System.out.println(getDiceRoll(20));
				break;
			case 24: // 2d4
				System.out.println(getDiceRoll(4));
				System.out.println(getDiceRoll(4));
				break;
			case 26: // 2d6
				System.out.println(getDiceRoll(6));
				System.out.println(getDiceRoll(6));
				break;
			case 28: // 2d8
				System.out.println(getDiceRoll(8));
				System.out.println(getDiceRoll(8));
				break;
			case 210: // 2d10
				System.out.println(getDiceRoll(10));
				System.out.println(getDiceRoll(10));
				break;
			case 212: // 2d12
				System.out.println(getDiceRoll(12));
				System.out.println(getDiceRoll(12));
				break;
			case 220: // 2d20
				System.out.println(getDiceRoll(20));
				System.out.println(getDiceRoll(20));
				break;
			} // end switch
			System.out.println("Would you like to throw again? Yes or No");
			String playAgain = input.next();
			if (!playAgain.equalsIgnoreCase("yes")) {
				diceRollChoice = false;
				break;
			}

		}
	}

	// my random number generator takes int max, adds 1 to ensure non-zero
	public static int getDiceRoll(int max) {
		// start and end point for random gen

		// create random method object
		Random rand = new Random();
		int dRandom = rand.nextInt(max);
		return (dRandom + 1);

	}
}
