package by.epam.hw03.branches;

/* 18. Подсчитать количество отрицательных среди чисел а, b, с. 
 */

public class Task18 {

	public static void main(String[] args) {

		int[] nums = { -1, 5, -9 };		
		System.out.printf("Даны числа: %d, %d и %d\n", nums[0], nums[1], nums[2]);
		System.out.printf("Количество отрицательных = %d\n", countNegativeNumbers(nums)); 
		

	}

	public static int countNegativeNumbers(int[] nums) {
		int counter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				counter++;
			}
		}

		return counter;
	}
}
