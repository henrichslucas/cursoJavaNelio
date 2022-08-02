import java.util.Locale;
import java.util.Scanner;
import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpando buffer
        int pos = 0;
        double avgHeight = 0.0;
        double percentage = 0.0;
        String belowSixteen[] = new String[n];
        Person p[] = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa", i + 1);
            System.out.println();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();
            sc.nextLine(); // limpando buffer

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            p[i] = new Person(name, age, height);

            avgHeight += p[i].getHeight();
            sc.nextLine(); // limpando buffer
        }

        avgHeight = avgHeight / p.length;

        for (int i = 0; i < p.length; i++) {
            if (p[i].getAge() < 16) {
                percentage += 1;
                belowSixteen[pos] = p[i].getName();
                pos++;
            }
        }

        percentage = (percentage * 100) / n;

        System.out.println("Altura media : " + avgHeight);
        System.out.println("Pessoas com menos de 16 anos: " + percentage + "%");

        for (int i = 0; i < pos; i++) {
            System.out.println(belowSixteen[i]);
        }

        sc.close();
    }
}
