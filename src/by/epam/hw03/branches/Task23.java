package by.epam.hw03.branches;

import java.util.Scanner;

/* 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены 
некорректные данные, то сообщить об этом.  */

public class Task23 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Введите день:");
		System.out.print(">>> ");

		while (!s.hasNextInt()) {
			s.nextLine();
			System.out.println("Ввод не верный! Попробуйте снова.");
			System.out.print(">>> ");
		}
		
		int day = s.nextInt();		
		
		System.out.println("Введите месяц:");
		System.out.print(">>> ");

		while (!s.hasNextInt()) {
			s.nextLine();
			System.out.println("Ввод не верный! Попробуйте снова.");
			System.out.print(">>> ");
		}		
		
		int month = s.nextInt();	
		
		if((day >= 1 && day <= 31) && (month >= 1 && month <= 12)) {
			System.out.println("Число и месяц введены корректно.");
		}else {
			System.out.println("Число и/или месяц введены НЕ корректно.");
		}
		
	}

}
