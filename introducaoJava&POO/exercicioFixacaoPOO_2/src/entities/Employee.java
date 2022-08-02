package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary(){
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		double newSalary =  this.netSalary() + (this.grossSalary * (percentage/100));
		System.out.println();
		System.out.println("Updated data: " + this.toString(newSalary));
	}
	
	public String toString(double salary) {
		return name + ", $ " + String.format("%.2f", salary);
	}
}
