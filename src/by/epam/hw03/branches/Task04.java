package by.epam.hw03.branches;

/* 4. Составить программу:  равны ли два числа а и b? */

public class Task04 {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;

		System.out.printf("Равны ли числа %d и %d ?\n", a, b);
		System.out.printf("Ответ: %b", isEqual(a, b));

	}

	public static boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		}
		return false;
	}
}
