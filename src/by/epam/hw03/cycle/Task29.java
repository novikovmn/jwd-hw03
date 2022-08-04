package by.epam.hw03.cycle;

import java.util.Arrays;

/*29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа*/

public class Task29 {

	public static void main(String[] args) {
		
		detectDigits(121, 51489);
		

	}
	
	public static void detectDigits(int a, int b) {
		fetchDigits(a);
		fetchDigits(b);
	}
	
	public static void fetchDigits(int num) {
		char[] digits = String.valueOf(num).toCharArray();
		System.out.printf("Цифры числа %d: " + Arrays.toString(digits) + "\n", num); 
	}

}
