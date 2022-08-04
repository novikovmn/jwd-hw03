package by.epam.hw03.branch;

/*32. Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них 
положительной. */

public class Task32 {

	public static void main(String[] args) {

		int a = -1;
		int b = -2;
		int c = 4;

		if ((a + b > 0) && (b + c < 0 && a + c < 0)) {
			System.out.println("a + b > 0");
		} else if ((b + c > 0) && (a + b < 0 && a + c < 0)) {
			System.out.println("b + c > 0");
		} else if ((a + c > 0) && (a + b < 0 && b + c < 0)) {
			System.out.println("a + c > 0");
		} else if ((a + b > 0 && b + c > 0) && (a + c < 0)) {
			System.out.println("a + b и b + c > 0");
		} else if ((a + b > 0 && a + c > 0) && (b + c < 0)) {
			System.out.println("a + b и a + c > 0");
		} else if ((b + c > 0 && a + c > 0) && (a + b < 0)) {
			System.out.println("b + c и a + c > 0");
		} else if (a + b > 0 && b + c > 0 && a + c > 0) {
			System.out.println("a + b, b + c и a + c > 0"); 
		} else {
			System.out.println("Ни одно сложение двух чисел их трех не дает положительного результата.");
		}

	}

}
