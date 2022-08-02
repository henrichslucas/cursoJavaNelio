package exercicios_logica_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoInserido, qtdInserido;
		
		codigoInserido = sc.nextInt();
		qtdInserido = sc.nextInt();
		
		switch(codigoInserido) {
		case 1:
			System.out.printf("Total: R$ %.2f", ((double)qtdInserido * 4.00));
			break;
		case 2:
			System.out.printf("Total: R$ %.2f", ((double)qtdInserido * 4.50));
			break;
		case 3:
			System.out.printf("Total: R$ %.2f", ((double)qtdInserido * 5.00));
			break;
		case 4:
			System.out.printf("Total: R$ %.2f", ((double)qtdInserido * 2.00));
			break;
		case 5:
			System.out.printf("Total: R$ %.2f", ((double)qtdInserido * 1.50));
			break;
		default:
			System.out.println("Digite uma opcao valida.");
			break;
		}
		
		sc.close();
	}

}
