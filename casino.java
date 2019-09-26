import java.util.Scanner;
import java.util.Random;

public class dice {

	public static void main(String[] args) {

		// I have moved the variable declarations to the beginning of the main() method.
		// This makes the code easier to read and is a common practice.
		int total = 0;
		int result;
		String name;
		Random rand = new Random();
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Welcome to the dice game!");

		do {

			System.out.println("Enter roll, or total (this is case sensitive please dont get your feelings hurt)");
			name = myScanner.next();

			switch (name) {

			case "roll":
				result = rand.nextInt(6) + 1;
				total = total + result;
				System.out.println("You rolled a " + result + " ");// 
				break;

			case "total":
				System.out.println("Your total is " + total + " ");
				break;

			default:
				System.out.println("That's not a command you dingbat");
				break;

			}

		} while (total < 20);

		System.out.println(total);

		if (total == 20)
			System.out.println("Congratulations you win!");
		else if (total > 20)
			System.out.println("House wins!");

	}

}