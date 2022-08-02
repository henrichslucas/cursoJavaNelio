package exercicios_logica;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorArea, valorRaio, valorPi;

		valorPi = 3.14159;
		valorRaio = sc.nextDouble();
		valorArea = valorPi * Math.pow(valorRaio, 2);

		System.out.printf("A=%.4f", valorArea);

		sc.close();
	}

}
