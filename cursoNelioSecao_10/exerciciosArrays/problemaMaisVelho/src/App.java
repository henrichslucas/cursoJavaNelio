import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person person[] = new Person[n];
        Person oldest = new Person();

        for (int i = 0; i < person.length; i++) {
            System.out.printf("Dados da %da pessoa", i + 1);

            System.out.print("Nome :");
            String name = sc.nextLine();

            System.out.print("Idade : ");
            int age = sc.nextInt();
            sc.nextLine();

            person[i] = new Person(name, age);

            if (person[i].getAge() > oldest.getAge()) {
                oldest.setAge(person[i].getAge());
                oldest.setName(person[i].getName());
            }

        }

        System.out.println("\nPESSOA MAIS VELHA: " + oldest.getName());

        sc.close();
    }
}
