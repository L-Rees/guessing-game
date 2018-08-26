import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int secretNumber = 2;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		System.out.println("Choose a number between 1 and 10");
		int guessedNumber = input.nextInt();
		String result;
		if (secretNumber == guessedNumber) {
			result = "You won!";
		}else {
			result = "You lost!";
		}
		System.out.println(result);
		input.close();
	}

}
