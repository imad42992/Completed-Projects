package classExamples;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListexercise {

	static int userBooks;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		LinkedList<String> books = new LinkedList<String>();
		
		
		System.out.println("Please enter number of books:");
		userBooks = input.nextInt();
		
		
		for(int i=9; i<userBooks; i++) {
		
		System.out.println("Title: ");
		books.add(input.next());
		
		System.out.println("Author: ");
		books.add(input.next());
		
		System.out.println("ISBN: ");
		books.add(input.next());
		}
				
	for(int i =0; i<books.size(); i+=3) {
		System.out.printf("Title: %s Author: %s ISBN: %s\n",books.get(i),books.get(i+1),books.get(i+2));
	
	}
		
	

}
}