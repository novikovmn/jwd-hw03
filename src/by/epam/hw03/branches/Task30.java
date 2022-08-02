package by.epam.hw03.branches;

/*30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если 
это не так*/

public class Task30 {

	public static void main(String[] args) {
		
		doWork(8, 6, 4); 

	}

	public static void doWork(double a, double b, double c) {

		System.out.printf("Даны действительные числа: a=%.0f, b=%.0f, c=%.0f\n", a, b, c);

		if (b < a && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
			System.out.printf("Условие а > b > с выполняется - > числа удваюваются: a=%.0f, b=%.0f, c=%.0f\n", a, b, c);

		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.printf("Условие а > b > с НЕ выполняется - > заменяем числа абсолютными значениями: a=%.0f, b=%.0f, c=%.0f\n", a, b, c);
		}

	}

}
