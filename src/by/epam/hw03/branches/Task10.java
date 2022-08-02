package by.epam.hw03.branches;

/* 10. Составить программу, которая определит площадь какого круга меньше. 
 */

public class Task10 {

	public static void main(String[] args) {

		findMinAreaOfTwoCircles(21, 51);

	}

	public static void findMinAreaOfTwoCircles(int s1, int s2) {
		System.out.printf("Даны площади кругов: s1 = %d и s2 = %d\n", s1, s2);

		if (s1 < s2) {
			System.out.println("Площадь s1 < s2");
		} else {
			System.out.println("Площадь s1 > s2");
		}

	}

}
