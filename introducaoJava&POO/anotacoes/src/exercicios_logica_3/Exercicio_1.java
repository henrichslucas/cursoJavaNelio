package exercicios_logica_3;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 2002, tentativa;
		tentativa = sc.nextInt();
		
		while(tentativa != senhaCorreta) {
			System.out.println("Senha Invalida");
			tentativa = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
