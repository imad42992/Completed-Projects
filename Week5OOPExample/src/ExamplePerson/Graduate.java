package ExamplePerson;

public class Graduate extends Student implements IAfterGraduation {
	private boolean certified;
	
	public void Done() {
		System.out.println("I'm a Prof JD!");
	}
	
	public Graduate(boolean certified, String course, String organization, String name, String DOB) {
		this.certified = certified;
		this.setCourse(course);
		this.setOrganization(organization);
		this.setName(name);
		this.setDOB(DOB);
}
	public Graduate() {}

	/**
	 * @return the certified
	 */
	public boolean isCertified() {
		return certified;
	}

	/**
	 * @param certified the certified to set
	 */
	public void setCertified(boolean certified) {
		this.certified = certified;
	}
}