import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double avg = 0.0;
        int n = sc.nextInt();
        double heights[] = new double[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextDouble();
            avg += heights[i];
        }

        avg = avg / heights.length;

        System.out.println("AVERAGE HEIGHT = " + String.format("%.2f", avg));

        sc.close();
    }
}
