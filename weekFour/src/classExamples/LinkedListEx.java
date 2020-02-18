package classExamples;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<Integer> order = new LinkedList<Integer>();
		Scanner in = new Scanner(System.in);
		int c = 0; int t = 0; int s = 0; int userInput = 0;
		
		
		do {
		System.out.printf("Select one of the following:\n 1- Coffee\n 2- Tea\n 3- Sandwich\n 4- Exit\n");
		
		userInput = in.nextInt();
	
		
		switch (userInput) {
		case 1:
			order.add(1);
			System.out.println("Coffee Added");
			break;
		case 2:
			order.add(2);
			System.out.println("Tea Added");
			break;
		case 3:
			order.add(3);
			System.out.println("Sandwich Added");
			break;
		default:
			order.add(4);
			System.out.println("Order Completed");
			break;
		}
		}while(userInput < 4);
		
		for(int i : order) {
			switch(i) {
			case 1:
				c++;
				break;
			case 2:
				t++;
				break;
			case 3:
				s++;
				break;
			}
			
		}
		
		   System.out.println("Coffee qty= " + c + " | Tea qty= " + t + " | Sandwich qty= " + s);
	        System.out.println("Total = $" + ((c * 2) + (t * 1) + (s * 3)));
		
	

}

		
		
	

}
