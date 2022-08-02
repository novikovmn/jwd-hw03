package by.epam.hw03.branches;

/* 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х   */

public class Task07 {

	public static void main(String[] args) {

		double a = 2;
		double b = 1.3;
		double c = 0.5;
		double x = 4;

		System.out.println(calculateExpr(a, b, c, x));
		
	}

	public static double calculateExpr(double a, double b, double c, double x) {

		return Math.abs(a * x * x + b * x + c);
	}

}
