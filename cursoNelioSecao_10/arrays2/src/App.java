import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double avg = 0;
        int n = sc.nextInt();
        sc.nextLine(); // limpando buffer de entrada
        Product prodVector[] = new Product[n];

        for (int i = 0; i < prodVector.length; i++) {
            prodVector[i] = new Product(sc.nextLine(), sc.nextDouble());
            sc.nextLine();
            avg += prodVector[i].getPrice();
        }

        avg = avg / prodVector.length;

        System.out.println("Average price = " + avg);

        sc.close();
    }
}
