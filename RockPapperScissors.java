package Conditional;

import java.util.Scanner;

public class RockPapperScissors {
	public static void main(String[] args) {
		char player1;
		char player2;
		System.out.println("Welcome to ROCK PAPER SCISSORS GAME\nEnter r- rock\ns-scissor\np-paper");

		char rock = 'r', paper = 'p', scissors = 's';
		int count = 3;
		while (count > 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Player-1 Enter your Input ");
			player1 = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.println("Player-2 Enter your Input ");
			player2 = scanner.next().charAt(0);
			scanner.nextLine();

			if (player1 == player2) {
				count--;
				System.out.println("Input Got Clashed , Number of attempts left : " + count + " times");

			} else if ((player1 == rock && player2 == scissors) || (player1 == paper && player2 == rock)
					|| player1 == scissors && player2 == paper) {
				count--;
				System.out.println("Player-1 WON");
				System.out.println("You can try again for " + count + " times");
			} else {
				count--;
				System.out.println("Player-2 WON");
				System.out.println("You can try again for " + count + " times");
			}
		}
	}
}
