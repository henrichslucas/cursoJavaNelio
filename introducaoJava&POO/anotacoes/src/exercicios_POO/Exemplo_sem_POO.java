package exercicios_POO;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_sem_POO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areaX, ladoAX, ladoBX, ladoCX, p;
		double areaY, ladoAY, ladoBY, ladoCY;
		
		System.out.println("Enter the measures of triangle X:");
		
		ladoAX = sc.nextDouble();
		ladoBX = sc.nextDouble();
		ladoCX = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		
		ladoAY = sc.nextDouble();
		ladoBY = sc.nextDouble();
		ladoCY = sc.nextDouble();
		
		p = (ladoAX + ladoBX + ladoCX) / 2;
		areaX = (p*((p-ladoAX)) * (p-ladoBX) * (p-ladoCX));
		
		p = (ladoAY + ladoBY + ladoCY) / 2;
		areaY = (p * ((p-ladoAY)) * (p-ladoBY) * (p-ladoCY));
		
		System.out.printf("Triangle X area: %.4f %n", (Math.sqrt(areaX)));
		System.out.printf("Triangle Y area: %.4f %n", (Math.sqrt(areaY)));
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
