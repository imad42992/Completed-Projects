package ExamplePerson;

public class Student extends Person implements IAfterGraduation{
	private String course;
	private String organization;
	
	public void Learn() {
		System.out.println("I'm Learning!");
	}
	public Student(String course, String organization, String name, String DOB) {
		this.course = course;
		this.organization = organization;
		this.setName(name);
		this.setDOB(DOB);
	}
	public Student() {}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}
	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}
}
