import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int mat[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int chosenNumber = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == chosenNumber) {
                    System.out.println("Position: " + i + "," + j);

                    if (i - 1 >= 0) {
                        System.out.println("Up:" + mat[i - 1][j]);
                    }

                    if (j - 1 >= 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }

                    if (i + 1 < m - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }

                    if (j + 1 < n - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                }
            }
        }

        sc.close();
    }

}
