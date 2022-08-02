package entities;

public class Student {
	
	public String name;
	public double firstScore;
	public double secondScore;
	public double thirdScore;
	
	public double finalGrade() {
		
		return firstScore + secondScore + thirdScore;
	}
	
	public void isApproved() {
		if(finalGrade() >= 60.0) {
			System.out.println("PASS");

		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60.0 - finalGrade() );
		}
	}
	
}
