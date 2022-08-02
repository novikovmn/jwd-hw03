package by.epam.hw03.branches;

/* 19. Подсчитать количество положительных среди чисел а, b, с. 
 */

public class Task19 {

	public static void main(String[] args) {

		int[] nums = { -1, 5, -9 };		
		System.out.printf("Даны числа: %d, %d и %d\n", nums[0], nums[1], nums[2]);
		System.out.printf("Количество положительных = %d\n", countPositiveNumbers(nums)); 
		

	}

	public static int countPositiveNumbers(int[] nums) {
		int counter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				counter++;
			}
		}

		return counter;
	}
}
