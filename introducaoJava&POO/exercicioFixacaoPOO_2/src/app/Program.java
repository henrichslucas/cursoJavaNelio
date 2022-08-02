package app;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();

		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println();

		System.out.println("Employee: " + emp.toString(emp.netSalary()));
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		System.out.println();

		sc.close();
	}

}
