package by.epam.hw03.cycle;

import java.util.Scanner;

/* 6.  Напишите  программу,  где  пользователь  вводит любое  целое  положительное  число. А  программа 
суммирует все числа от 1 до введенного пользователем числа. */

public class Task06 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Введите целое положительное число:");
		System.out.print(">>> ");
		
		while(!s.hasNextInt()) {
			s.nextLine();
			System.out.println("Введено не число! Попробуйте снова.");
			System.out.print(">>> ");
		}

		int input = s.nextInt();
		
		if(input < 0) {
			System.out.println("Число отрицательное! Программа завершена.");
			return;
		}
		
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum += i;
		}
		
		System.out.printf("Сумма чисел от 1 до %d = %d", input, sum);
		

	}

}
