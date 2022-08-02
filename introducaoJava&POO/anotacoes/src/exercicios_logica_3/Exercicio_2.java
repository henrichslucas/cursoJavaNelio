package exercicios_logica_3;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 && y != 0 ) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			
			if( x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			
			if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			
			if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		};
		
		sc.close();
	}

}
