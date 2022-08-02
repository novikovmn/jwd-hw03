package by.epam.hw03.branches;

/* 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через 
отверстие.  */

public class Task31 {

	public static void main(String[] args) {

		checkRectangle(10, 4, 9, 6, 18);

	}

	public static void checkRectangle(int a, int b, int x, int y, int z) {

		System.out.printf("Стороны отверстия: a=%d, b=%d\n", a, b);
		System.out.printf("Размеры кирпича: x=%d, y=%d, z=%d\n", x, y, z);

		int holeArea = a * b;

		int brickSideArea1 = x * y;
		int brickSideArea2 = z * y;
		int brickSideArea3 = z * x;

		if (brickSideArea1 <= holeArea || brickSideArea2 <= holeArea || brickSideArea3 <= holeArea) {
			System.out.println("Кирпич пройдет.");
		} else {
			System.out.println("Кирпич не пройдет.");
		}

	}

}
