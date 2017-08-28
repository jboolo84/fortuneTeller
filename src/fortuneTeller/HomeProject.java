package fortuneTeller;

import java.util.Scanner;

public class HomeProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter you Fisrt Name");
		String firstName = input.nextLine();
		System.out.println("Enter you last Name");
		String lastName = input.nextLine();
		System.out.println("what is your age");
		int age = input.nextInt();
		System.out.println("What your Birthday");
		int birthDay = input.nextInt();

		System.out.println("What is your favorite Color: ");

		String jam = input.next();

		if (jam.equalsIgnoreCase("red")) {
			System.out.println("What is your age");

		}

		else if (jam.equalsIgnoreCase("orange")) {

			System.out.println("Have some orange you look thirsty");
		}

		else if (jam.equalsIgnoreCase("Green")) {

			;
		} else if (jam.equalsIgnoreCase("Blue")) {

		} else if (jam.equalsIgnoreCase("INDingo")) {

		} else if (jam.equalsIgnoreCase("violet")) {

		} else {

			System.out.println("Please say i need HELP");
		}
		{
			String help = input.next();
			System.out.println("the colors are : red, orange, green, blue, indigo and voile");

		}

		int age1 = input.nextInt();

	
		System.out.println("how sister and brothers do you have?");

	}
}
