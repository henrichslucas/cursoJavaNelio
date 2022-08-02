package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.firstScore = sc.nextDouble();
		student.secondScore = sc.nextDouble();
		student.thirdScore = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));
		
		student.isApproved();
		
		sc.close();
	}

}
