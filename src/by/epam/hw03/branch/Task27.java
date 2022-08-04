package by.epam.hw03.branch;

/*27. Найти max{min(a, b), min(c, d)}. 
*/

public class Task27 {

	public static void main(String[] args) {
		
		findMaxValue(2, 5, 9, 4); 

	}

	public static void findMaxValue(int a, int b, int c, int d) {
		System.out.printf("Дано: a=%d, b=%d, c=%d, d=%d\n", a, b, c, d);
		int minBetweenAandB = minNumber(a, b);
		System.out.printf("Меньшее среди a и b = %d\n", minBetweenAandB);
		int minBetweenCandD = minNumber(c, d);
		System.out.printf("Меньшее среди c и d = %d\n", minBetweenCandD);
		int max = maxnNumber(minBetweenAandB, minBetweenCandD);
		System.out.printf("Наибольшее среди минимальных  = %d\n", max);

	}

	public static int minNumber(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int maxnNumber(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
