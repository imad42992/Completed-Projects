package ExamplePerson;

public class Person {
	private String name;
	private String DOB;
	
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
	 * @return the dOB
	 */
	public String getDOB() {
		return DOB;
	}

	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public Person() {}
	
	public Person(String name, String DOB) {
		this.name = name;
		this.DOB = DOB;
}
	public void Talk() {
		System.out.println("I'm Talking!");
	}
	
	public void Walk() {
		System.out.println("I'm Walking!");
	}

}