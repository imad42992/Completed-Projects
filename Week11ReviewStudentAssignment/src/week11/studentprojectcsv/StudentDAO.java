package week11.studentprojectcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentDAO {
	

	
	
	//method change score
	
	public static Boolean changeScore(int id, double score1, double score2, double score3) {
		
		String location = "C:\\Users\\imad4\\eclipse-workspace\\Week11ReviewStudentAssignment\\src\\week11\\studentprojectcsv\\studentscores.txt";
		File file = new File(location);
		
		try {
			ArrayList<Student> addSt = getStudent();
			
			Student change = new Student(id, addSt.get(id-1).getName(), score1,score2,score3);
			for(Student xx:addSt) {
				if(xx.getId()==id) {
					addSt.set(id-1, change);
				}
			}
			
			
		FileWriter writer = new FileWriter(file,false);
		
		for(int i = 0; i < addSt.size(); i++) {
			writer.write(addSt.get(i).getId()+ 
					"," + addSt.get(i).getName()+
					","+ addSt.get(i).getScore1()+
					","+ addSt.get(i).getScore2()+
					","+ addSt.get(i).getScore3()+
					"\n"
					);
		}
		writer.close();
		System.out.println(id + "Was Changed!");
		return true;	
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//method to get student
	
	public static ArrayList<Student> getStudent() {
		String location = "C:\\Users\\imad4\\eclipse-workspace\\Week11ReviewStudentAssignment\\src\\week11\\studentprojectcsv\\studentscores.txt";
		File file = new File(location);
		ArrayList<Student> studentList = new ArrayList<Student>();

		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String[] line = input.nextLine().split(",");
				
				studentList.add(new Student(
						Integer.parseInt(line[0]), 
						line[1], 
						Double.parseDouble(line[2]), 
						Double.parseDouble(line[3]), 
						Double.parseDouble(line[4])));
			
			}input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: There was a problem while trying to read the student .csv file");
			e.printStackTrace();
		}
		return studentList;
	}
	
	//method to add student
	
	public static Boolean addStudent(int id, String name, double score1, double score2, double score3) {
		String location = "C:\\Users\\imad4\\eclipse-workspace\\Week11ReviewStudentAssignment\\src\\week11\\studentprojectcsv\\studentscores.txt";
		File file = new File(location);
		
		try {
			ArrayList<Student> addSt = getStudent();
			
			for(int i=0; i<addSt.size(); i++) {
				if(addSt.get(i).getId() == id) {
				System.out.println("Student ID already exists");
				return false;
				}
		}
		addSt.add(new Student(id,name,score1,score2,score3));
		
		FileWriter writer = new FileWriter(file,false);
		
		for(int i = 0; i < addSt.size(); i++) {
			writer.write(addSt.get(i).getId()+ 
					"," + addSt.get(i).getName()+
					","+ addSt.get(i).getScore1()+
					","+ addSt.get(i).getScore2()+
					","+ addSt.get(i).getScore3()+
					"\n"
					);
		}
		writer.close();
		System.out.println(id + "Was Added!");
		return true;	
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static void searchID(int id) {
		ArrayList<Student> list = getStudent();
		for(Student x:list) {
			if(x.getId()==id) {
				System.out.printf("%-5d|%-10s|%-10.2f|%-10.2f|%-10.2f| \n", x.getId(), x.getName(), x.getScore1(),x.getScore2(),x.getScore3());
			}
		}
	}
	
	public static void searchName(String name) {
		ArrayList<Student> list = getStudent();
		for(Student x:list) {
			if(x.getName().equalsIgnoreCase(name)) {
				System.out.printf("%-5d|%-10s|%-10.2f|%-10.2f|%-10.2f| \n", x.getId(), x.getName(), x.getScore1(),x.getScore2(),x.getScore3());
			}
		}
	}
	

}
