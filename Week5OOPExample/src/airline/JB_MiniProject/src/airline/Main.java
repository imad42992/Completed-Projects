package airline.JB_MiniProject.src.airline;

import java.util.Scanner;

public class Main {
	//Darril
	public static void main(String[] args) {
		Seats book = new Seats();
		//creating a scanner object for user input
		Scanner scan = new Scanner(System.in);
		//creating a boolean to end the program
		boolean exit = false;
		System.out.println("Welcome to continue press enter");
		
		//loop to continue entering seats until user exits program 

		while (exit == false) {
			//try to catch any errors
			try {
				String input;
				input = scan.nextLine();
				
				System.out.println("Please enter the seats you would like to book: (Letter Number,)");

				input = scan.nextLine();
				//method to take user input and spilt it into row and columns
				book.enterSeats(input);
                 //prints seating chart and it shows which seats available
				book.printPlane();
				//if try catches any error it prints the below statement
			} catch (Exception ex) {
				System.out.println("Please Enter a Valid Seat Number");

			}
			System.out.println("Would you like to book another seat? (1: yes, 2:no)");
			String againString = scan.next();
			//check the user input to continue or exit the program
			if (againString.equals("1")) {
				exit = false;
			} else {
				exit = true;
			}
		}
		scan.close();
	}

}
