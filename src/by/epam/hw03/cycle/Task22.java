package by.epam.hw03.cycle;

/* 22. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат 
представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие 
значения функции: F(x) = sin^2(x)
 */

public class Task22 {

	public static void main(String[] args) {

		double a = 1;
		double b = 10;
		double h = 1;
		double func = 0;

		System.out.println("|\tx\t|\tfunc\t|");
		System.out.println("|===============================|");
		for (double x = a; x <= b; x += h) {
			func = Math.sin(x) * Math.sin(x);
			System.out.printf("|\t%.0f\t|\t%.2f\t|\n", x, func);
		}
		System.out.println("|===============================|");

	}

}
