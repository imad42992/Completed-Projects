package CoreJava.DAO;

import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {
	
	public CourseDAO() {}
	
    public List<Course> getAllCourses(){
    	String location = "C:\\Users\\imad4\\eclipse-workspace\\Final Project.zip_expanded\\Final Project\\courses.csv";
    	File file = new File(location);
    	ArrayList<Course> courseList = new ArrayList<Course>();
    	try {
    		Scanner input = new Scanner(file);
    		while(input.hasNextLine()) {
    			String[] line = input.nextLine().split(",");
    			
    			courseList.add(new Course(Integer.parseInt(line[0]), line[1], line[2]));
    			
    		}
    		input.close();
    	}catch (FileNotFoundException e) {
    		System.out.println("Error: There was a problem reading file Course.csv ");
    	}
    	return courseList;
    }
}
