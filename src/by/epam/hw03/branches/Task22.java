package by.epam.hw03.branches;

/* 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее. 
 */

public class Task22 {

	public static void main(String[] args) {
		replaceMinMax(2, 7); 
	}

	public static void replaceMinMax(int x, int y) {

		System.out.printf("Дано: x = %d, y = %d\n", x, y);

		int minVal = min(x, y);
		int maxVal = max(x, y);

		System.out.printf("Меньшее = %d, большее = %d\n", minVal, maxVal);

		x = maxVal;
		y = minVal;

		System.out.printf("Теперь: x = %d, y = %d\n", x, y);

	}

	public static int min(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}

	public static int max(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

}
