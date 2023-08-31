package org.monthlytask;

import java.util.Random;
import java.util.Scanner;

public class Day31_RockPaperScissor {

	// Rock, paper scissor game coding
	public static int rockPaperScissor(int user_option, int bot_option) {

		int win = 0;
		if (user_option >= 3 || user_option < 0) {
			System.out.print("Choose the valid option.");
		} else {

			System.out.println("User choice: " + user_option);
			System.out.println("Bot choice: " + bot_option);

			if (user_option == bot_option) {
				win = 2;
			} else if (user_option == 0 && bot_option == 2) {
				win = 1;
			} else if (user_option == 2 && bot_option == 0) {
				win = 0;
			} else if (user_option > bot_option) {
				win = 1;
			} else if (user_option < bot_option) {
				win = 0;
			}
		}
		return win;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the option: \n0. Rock\n1. Paper\n2. Scissior");
		int user_option = sc.nextInt();

		Random r = new Random();
		int bot_option = r.nextInt(3);

		int result = rockPaperScissor(user_option, bot_option);
		if (result == 1) {
			System.out.println("User wins");
		} else if (result == 0) {
			System.out.println("Bot wins");
		} else {
			System.out.println("Draw");
		}
	}

}
