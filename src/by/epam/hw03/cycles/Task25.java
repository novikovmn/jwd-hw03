package by.epam.hw03.cycles;

import java.util.Scanner;

/* 25. Требуется определить факториал числа, которое ввел пользователь. 
 */

public class Task25 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Введите число:");
		System.out.print(">>> ");
		while(!s.hasNextDouble()) {
			s.nextLine();
			System.out.println("Введено не число! Попробуйте еще раз:");
			System.out.print(">>> ");
		}
		
		double input = s.nextDouble();
		
		if(input < 0) {
			input *= -1; // убираем минус, если есть
		}
		
		double factorial = 1;
		for (double i = 1; i <= input; i++) {
			factorial *= i;
		}
		
		System.out.printf("Факториал числа %f = %f", input,factorial);
		
		

	}

}
