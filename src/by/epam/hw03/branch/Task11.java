package by.epam.hw03.branch;

/*11. Составить программу, которая определит площадь какого треугольника больше. 
*/

public class Task11 {

	public static void main(String[] args) {

		int s1 = 21;
		int s2 = 15;

		System.out.printf("Даны площади треугольников: s1 = %d и s2 = %d\n", s1, s2);
		System.out.printf("Большая площадь = %d\n", findMaxAreaOfTwoTriangle(21, 15));

	}

	public static int findMaxAreaOfTwoTriangle(int s1, int s2) {

		int maxArea = -1;
		if (s1 > s2) {
			maxArea = s1;
		} else {
			maxArea = s2;
		}
		return maxArea;
	}

}
