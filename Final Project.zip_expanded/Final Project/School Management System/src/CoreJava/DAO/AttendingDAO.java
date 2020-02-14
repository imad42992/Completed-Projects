package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {
	
	public AttendingDAO() {}

    public List<Attending> getAttending(){
    	String location = "C:\\Users\\imad4\\eclipse-workspace\\Final Project.zip_expanded\\Final Project\\attending.csv";
    	File file = new File(location);
		ArrayList<Attending> attendingList = new ArrayList<Attending>();

    	try {
    		Scanner input = new Scanner(file);
    		while(input.hasNextLine()) {
    			String[] line = input.nextLine().split(",");
    			
    			attendingList.add(new Attending(Integer.parseInt(line[0]), line[1]));
    		}
    		input.close();
    	}catch(FileNotFoundException e) {
    		System.out.println("Error: There was a problem while trying to read the student .csv file");
    	}
    	return attendingList;
    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
    	 int found = 0;
    	for(int i = 0; i < attending.size(); i++) {
    		if (attending.get(i).getStudentEmail().equals(studentEmail)&& attending.get(i).getCourseID()== courseID) {
    			found++;
    			
    		}
    		else if(!(attending.get(i).getStudentEmail().contentEquals(studentEmail)&& attending.get(i).getCourseID()==courseID)) {
    			
    		}
    	}
    	if(found==1) {
    		System.out.println("Already registered for this course: ");
    	}
    	else if(found==0) {
    		attending.add(new Attending(courseID,studentEmail));
    		saveAttending(attending);
    	}
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
    	ArrayList<Course>studentCourses = new ArrayList<Course>();
    	
    	for(Attending e:attending) {
    		if(e.getStudentEmail().contentEquals(studentEmail)) {
    			for(Course c: courseList) {
    				if(e.getCourseID()==c.getID()) {
    					studentCourses.add(new Course(c.getID(),c.getName(),c.getInstructor()));
    				}
    			}
    		}
    	}
    	return studentCourses;
    }

    public void saveAttending(List<Attending> attending){
    	
    	String location = "C:\\\\Users\\\\imad4\\\\eclipse-workspace\\\\Final Project.zip_expanded\\\\Final Project\\\\attending.csv";
    	File file = new File(location);
    	
    	try {
    		FileWriter writeAtt = new FileWriter(file,false);
    		
    		for(int i = 0; i < attending.size(); i++) {
    			writeAtt.write(attending.get(i).getCourseID()+","+attending.get(i).getStudentEmail());
    			writeAtt.append("\n");
    		}
    		System.out.println("Course Added!");
    		writeAtt.close();
    	}catch (Exception e) {
    		System.out.println("Error: There was a problem trying to add data to attending.csv");
    	}

    }

}
