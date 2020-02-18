package ExamplePerson;

public class Main {

	public static void main(String[] args) {

		Graduate Imad = new Graduate(true, "App Dev", "Per Scholas", "Imad", "04/29/92");
		System.out.println(Imad.getName()+" "+Imad.getCourse()+" "+Imad.getDOB()+" "+Imad.getOrganization()+" "+Imad.isCertified());
		
		
		
		Imad.Talk();
		Imad.Walk();
		Imad.Learn();
		Imad.Done();
		IAfterGraduation.ContinueLearning();
		IAfterGraduation.Happy();
		
		
		
	}

}
