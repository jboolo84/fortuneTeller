package fortuneTeller;

import java.util.Scanner;

public class partTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you Fisrt Name");
		String firstName = input.nextLine();
		System.out.println("Enter you last Name");
		String lastName = input.nextLine();
		System.out.println("what is your age");
		int age = input.nextInt();
		System.out.println("What your Birthday");
		String birdthDate = "amountInBankAcc";
		int birthDay = input.nextInt();

		if (birthDay == 1 || birthDay == 2 || birthDay == 3 || birthDay == 4) {
			birthDay = 56000;

		} else if (birthDay == 5 || birthDay == 6 || birthDay == 7 || birthDay == 8) {
			birthDay = 8000000;
		} else if (birthDay == 9 || birthDay == 10 || birthDay == 11 || birthDay == 12) {
			birthDay = 56;
		}

		else {
			birthDay = 0;

		}
		System.out.println("what is your favorite color");

		String fColor = input.next();

		if (fColor.equalsIgnoreCase("red")) {
			fColor = "Toyota";

		} else if (fColor.equalsIgnoreCase("orange")) {
			fColor = "Lexus";

		} else if (fColor.equalsIgnoreCase("Green")) {

			fColor = "Jeeb";

		} else if (fColor.equalsIgnoreCase("Blue")) {
			fColor = "Messerati";
		} else if (fColor.equalsIgnoreCase("INDingo")) {
			fColor = "Ford";

		} else if (fColor.equalsIgnoreCase("violet")) {
			fColor = "Chevy";
		} else {

			System.out.println("Please say i need HELP");
		}
		{

			if (age % 2 >= 0) {

				System.out.println("how many siblings do you have");
			}

			else if (age % 2 >= 1) {
				System.out.println("you dont belong here");
			}
		}

		String vacationHome = "numberOfsiblings";
		int siblings = input.nextInt();

		if (siblings < 0) {
			vacationHome = "Detroit";
		} else if (siblings == 1) {
			vacationHome = "Bora";

		}

		else if (siblings == 2) {

			vacationHome = "Bora";
		}

		else if (siblings == 3) {
			vacationHome = "Florida";

		} else if (siblings > 3) {
			vacationHome = "New York";

		} else {

		}
		System.out.println(firstName + " " + lastName + " will retire at age of " + " " + age + " " + "with" + " "
				+ birthDay + " " + "in his  bank acct," + " " + "a vacation home in" + " " + vacationHome + " "
				+ "and arrive with beautiful " + " " + fColor);
	}
}
