import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpando buffer
        int pos = 0;

        int pair[] = new int[n];

        for (int i = 0; i < pair.length; i++) {
            System.out.print("Digite um numero: ");

            int num = sc.nextInt();
            sc.nextLine();

            if (num % 2 == 0) {
                pair[pos] = num;
                pos++;
            }
        }

        System.out.print("NUMEROS PARES: \n");

        for (int i = 0; i < pos; i++) {
            System.out.print(pair[i] + " ");
        }

        System.out.print("\nQUANTIDADE DE PARES = " + pos);

        sc.close();
    }
}
