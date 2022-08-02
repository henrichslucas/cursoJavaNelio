package exercicios_logica;

import java.util.Scanner;

public class exercicio_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("Soma = %d", a + b);
		
		sc.close();
	}
}
