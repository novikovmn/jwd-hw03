package by.epam.hw03.branch;

/* 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти 
 * max(d — a, d — b, d — c). */

public class Task28 {

	public static void main(String[] args) {

		int a = 3;
		int b = 6;
		int c = 5;
		int d = 8;

		System.out.printf("Дано: a=%d, b=%d, c=%d, d=%d\n", a, b, c, d);

		if (a == d) {
			System.out.println("a = d");
		} else if (b == d) {
			System.out.println("b = d");
		} else if (c == d) {
			System.out.println("c = d");
		} else {

			int subtractionDandA = d - a;
			int subtractionDandB = d - b;
			int subtractionDandC = d - c;

			int max = findMax(subtractionDandA, subtractionDandB, subtractionDandC);

			System.out.printf("Т.к.  a(%d), b(%d) и c(%d) не равны d(%d),\n", a, b, c, d);
			System.out.printf("найдем большее среди: d-a(%d), d-b(%d), d-c(%d)\n", subtractionDandA, subtractionDandB,
					subtractionDandC);
			System.out.printf("Наибольшей разностью является: %d", max);

		}

	}

	public static int findMax(int num1, int num2, int num3) {

		int max = num1;

		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}

		if (num3 > max) {
			max = num3;
		}

		return max;

	}

}
