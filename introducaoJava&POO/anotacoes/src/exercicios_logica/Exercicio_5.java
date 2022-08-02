package exercicios_logica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2, qtdPeca1, qtdPeca2;
		double valorPeca1, valorPeca2;
		
		codigoPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		codigoPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		System.out.printf("CODIGO DA PECA 1: %d %n ", codigoPeca1);
		System.out.printf("CODIGO DA PECA 2: %d %n ", codigoPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2));
		
		sc.close(); 
	}

}
