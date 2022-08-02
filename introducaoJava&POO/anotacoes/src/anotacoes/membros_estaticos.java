package anotacoes;

import java.util.Locale;
import anotacoes_util.Calculator;

public class membros_estaticos {
	
	//public static final double PI_VALUE = 3.14159; //final == constante, nome todo em maiusculo para boa pratica

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double radius = 3.0;
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.println("CIRCUMFERENCE: " + String.format("%.2f", c) );
		System.out.println("VOLUME: " + String.format("%.2f", v) );
		System.out.println("PI: " + String.format("%.2f", Calculator.PI_VALUE) );
		
	}
}
