import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int pos = 0;
        sc.nextLine(); // consumindo buffer de leitura

        int negativeNumbers[] = new int[n];

        for (int i = 0; i < negativeNumbers.length; i++) {

            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            if (negativeNumbers.length <= 10) {
                if (number < 0) {
                    negativeNumbers[pos] = number;
                    pos++;
                }
            }
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < pos; i++) {
            System.out.println(negativeNumbers[i]);
        }

        sc.close();
    }
}
