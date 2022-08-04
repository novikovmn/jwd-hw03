package by.epam.hw03.cycles;

/* 23. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. Результат 
представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие 
значения функции: F(x) = ctg(x/3) + sin(x)/2
 */

public class Task23 {

	public static void main(String[] args) {

		double a = 1;
		double b = 5;
		double h = 1;
		double func = 0;

		System.out.println("|\tx\t|\tfunc\t|");
		System.out.println("|===============================|");
		for (double x = a; x <= b; x += h) {
			func = 1 / Math.tan(x / 3) + Math.sin(x) / 2;
			System.out.printf("|\t%.0f\t|\t%.2f\t|\n", x, func);
		}
		System.out.println("|===============================|");

	}

}
