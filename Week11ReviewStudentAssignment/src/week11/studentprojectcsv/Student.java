package week11.studentprojectcsv;

import java.util.ArrayList;
import java.util.TreeMap;

public class Student {

	private int id;
	private String name;
	private double score1;
	private double score2;
	private double score3;
	
	//default const
	public Student() {}

	//my const
	public Student(int id, String name, double score1, double score2, double score3) {
		super();
		this.id = id;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	

	
	//method to get student avg
	
	public static TreeMap<String,Student> avgStudent() {
		
		ArrayList<Student> objStudent = StudentDAO.getStudent();
		TreeMap<String,Student> sortedList = new TreeMap<String,Student>();

		for(Student xx:objStudent) {
			sortedList.put(xx.getName(), xx);
		}
		return sortedList;
	}
	
	
	//method to sort student by name or id
	
	public static TreeMap <String,Student> sortStudent() {
		ArrayList<Student> objStudent = StudentDAO.getStudent();
		TreeMap <String,Student> sortedList = new TreeMap<String,Student>();
		for(Student xx:objStudent) {
			sortedList.put(xx.getName(), xx);
		}
		return sortedList;
	}
	
	
	
	
	
	
	//Getters & Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the score1
	 */
	public double getScore1() {
		return score1;
	}

	/**
	 * @param score1 the score1 to set
	 */
	public void setScore1(double score1) {
		this.score1 = score1;
	}

	/**
	 * @return the score2
	 */
	public double getScore2() {
		return score2;
	}

	/**
	 * @param score2 the score2 to set
	 */
	public void setScore2(double score2) {
		this.score2 = score2;
	}

	/**
	 * @return the score3
	 */
	public double getScore3() {
		return score3;
	}

	/**
	 * @param score3 the score3 to set
	 */
	public void setScore3(double score3) {
		this.score3 = score3;
	}
	
}
