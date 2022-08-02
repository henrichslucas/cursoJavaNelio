import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();
        int biggestValuePos = 0;
        double biggestValue = 0.0;

        double numbers[] = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            double number = sc.nextDouble();
            numbers[i] = number;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestValue) {
                biggestValue = numbers[i];
                biggestValuePos = i;
            }
        }

        System.out.println("MAIOR VALOR = " + biggestValue);
        System.out.println("POSICAO DO MAIOR VALOR = " + biggestValuePos);

        sc.close();
    }
}
