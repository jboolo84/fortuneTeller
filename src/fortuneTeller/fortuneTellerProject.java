package fortuneTeller;

import java.util.Scanner;

public class fortuneTellerProject {

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
		 
		if(jam.equalsIgnoreCase("red")) 
		{
			System.out.println("What is your age");
			
		}
		
		 else if(jam.equalsIgnoreCase("orange"))
		 {
			 
			 System.out.println("Have some orange you look thirsty");
		 }
	
			else if(jam.equalsIgnoreCase("Green")) {
		
		System.out.println("what you doing with you life , have some green");
		}
			else if (jam.equalsIgnoreCase("Blue")) {
				System.out.println("you need to take a swim");
			} else if (jam.equalsIgnoreCase("INDingo")) {
				
				System.out.println("what on earth is indino, man your lost");
			} else if(jam.equalsIgnoreCase("violet")) {
				System.out.println("violet is your color, finally, you got some sense");
			}
			else {
				
				System.out.println("Please say i need HELP");
			}
		while (jam.equalsIgnoreCase("red"));{
			
			System.out.println("What is your age");
		}
		
		
		System.out.println("the colors are : red, orange, green, blue, indigo and voile");
		
	}  
	
}
 
