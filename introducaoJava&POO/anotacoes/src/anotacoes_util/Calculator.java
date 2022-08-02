package anotacoes_util;

public class Calculator {
	public static final double PI_VALUE = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI_VALUE * radius;
	}
	
	public static double volume(double radius) {
		return (4.0 * PI_VALUE * (Math.pow(radius, 3))) / 3;
	}
}
