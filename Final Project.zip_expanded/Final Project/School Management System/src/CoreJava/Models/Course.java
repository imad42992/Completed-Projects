package CoreJava.Models;

public class Course {
	public Course() {}
	
	private int ID;
	private String Name;
	private String instructor;

	

	public Course(int ID, String Name, String instructor) {
		this.ID = ID;
		this.Name = Name;
		this.instructor = instructor;
	}



	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}



	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}



	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}



	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
}