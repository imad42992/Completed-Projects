package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {
	
	public StudentDAO() {}
	
	public List<Student> getStudents() {
		String location = "C:\\Users\\imad4\\eclipse-workspace\\Final Project.zip_expanded\\Final Project\\students.csv";
		File file = new File(location);
		ArrayList<Student> data = new ArrayList<Student>();

		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String[] line = input.nextLine().split(",");
				data.add(new Student(line[0], line[1], line[2]));
			}input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: There was a problem while trying to read the student .csv file");
			e.printStackTrace();
		}
		return data;

	}

	public Student getStudentByEmail(List<Student> studentList, String studentEmail) {
		
		Student x = null;
		for(Student s: studentList) {
			if(s.getEmail().equals(studentEmail)) {
				x = s;
			}
		}
		return x;
	}

	public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {
			for(int i = 0; i < studentList.size(); i++) {
				String a = studentList.get(i).getEmail();
				String b = studentList.get(i).getPass();
			if(a.equals(studentEmail)&&b.equals(studentPass))
				return true;
			}
	return false;
}
	
}
