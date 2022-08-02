package util;

public class CurrencyConverter {
	public static double toReais(double price, double quantity ) {
		double convertedDollar = quantity * price;
		return   convertedDollar + (convertedDollar * 0.06);
	}
}
