import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        int check = 0;

        System.out.print("How many employees will be registered? ");
        Integer n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            Employee emp = new Employee(id, name, salary);

            employees.add(emp);

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.print("Enter the percentage: ");
                Double percentage = sc.nextDouble();
                emp.changeSalary(emp.getSalary(), percentage);
                check = 1;
            }

            if (check == 0) {
                System.out.println("This id does not exist!\n");
            }
        }

        System.out.println("List of employees: ");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

        sc.close();
    }
}
