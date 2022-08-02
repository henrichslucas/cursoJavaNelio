package exercicios_logica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, horaTrabalhada;
		double valorPorHora;
		
		numFuncionario = sc.nextInt();
		horaTrabalhada = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		System.out.printf("NUMBER = %d %n", numFuncionario);
		System.out.printf("SALARY = U$ %.2f %n", (valorPorHora * horaTrabalhada));
		sc.close();
	}

}
