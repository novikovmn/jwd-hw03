package by.epam.hw03.cycles;

/* 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или 
равен заданному е. Общий член ряда имеет вид: 
	an = (-1)^n-1 / n

 */

public class Task18 {

	public static void main(String[] args) {

		double from = 1;
		double to = 100;
		double e = 0.8;
		double an = 0;

		double sum = 0;

		for (double n = from; n <= to; n++) {
			an = Math.pow(-1, n - 1) / n;
			if (Math.abs(an) >= e) {
				sum += an;
			}
		}

		System.out.println("Сумма = " + sum);

	}

}
