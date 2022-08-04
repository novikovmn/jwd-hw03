package by.epam.hw03.cycle;

/*20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или 
равен заданному е. Общий член ряда имеет вид:
	an = 1 / (3*n-2)*(3*n+1) 
*/

public class Task20 {

	public static void main(String[] args) {

		int from = 1;
		int to = 7;
		double e = 1.5;
		double sum = 0;

		for (int n = from; n <= to; n++) {
			double an = 1 / (3 * n - 2) * (3 * n + 1);
			if (Math.abs(an) >= e) {
				sum += an;
			}
		}

		System.out.println("Сумма = " + sum);

	}

}
