package week11.studentprojectcsv;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class MainRunner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String userInput = null;
		int selection;
		do {
			System.out.println("Do you want to exit: y or n");
			userInput = input.next();
			System.out.println("Do you want to exit: y or n");
			System.out.println("Select from list: ");
			System.out.println("1. Calculate Student Average");
			System.out.println("2. Change Student Score");
			System.out.println("3. Add Student");
			System.out.println("4. Sort Student");
			System.out.println("5. Search by Id or Name");
			System.out.println("6. View Students");
			selection = input.nextInt();
			switch (selection) {
			case 1:
				Student.avgStudent();

				break;
			case 2:
				System.out.println("Student ID:");
				int id1 = input.nextInt();
				System.out.println("score 1,score 2, and score 3:");
				int score11=input.nextInt();
				int score21=input.nextInt();
				int score31=input.nextInt();
				StudentDAO.changeScore(id1, score11, score21, score31);
			
				break;
			case 3:

				System.out.println("Student ID:");
				int id = input.nextInt();
				System.out.println("Student Name:");
				String name = input.next();
				System.out.println("score 1, score 2, score 3:");
				int score1 = input.nextInt();
				int score2 = input.nextInt();
				int score3 = input.nextInt();

				StudentDAO.addStudent(id, name, score1, score2, score3);

				break;
			case 4:
				TreeMap <String,Student> sort = Student.sortStudent();
				System.out.printf("%-5s|%-10s|%-10s|%-10s|%-10s| \n", "#", "NAME", "SCORE 1","SCORE 2","SCORE 3");
				sort.forEach((k,v)->{
					System.out.printf("%-5d|%-10s|%-10.2f|%-10.2f|%-10.2f| \n", v.getId(), v.getName(), v.getScore1(),v.getScore2(),v.getScore3());
				});
				break;
			case 5:
				int search;
				System.out.println("1. Name | 2. ID");
				search = input.nextInt();
				if(search ==1) {
					System.out.println("Enter Student Name:");
					String studentName = input.next();
					StudentDAO.searchName(studentName);
				} else if(search == 2) {
					System.out.println("Enter Student ID:");
					int studentID = input.nextInt();
					StudentDAO.searchID(studentID);
				}
				break;
				
			case 6:
				ArrayList<Student> viewStudent = StudentDAO.getStudent();
				System.out.printf("%-5s|%-10s|%-10s|%-10s|%-10s| \n", "#", "NAME", "SCORE 1", "SCORE 2", "SCORE 3");

				for (Student x : viewStudent) {
					System.out.printf("%-5d|%-10s|%-10.2f|%-10.2f|%-10.2f| \n", x.getId(), x.getName(), x.getScore1(),
							x.getScore2(), x.getScore3());

				}

				break;

			default:
				System.out.println("Goodbye");
				System.exit(1);
			}

		} while (userInput.equals("n"));

		input.close();

	}
}
