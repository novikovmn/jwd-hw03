package by.epam.hw03.branches;

import java.util.Scanner;

/*
3. Составить программу сравнения введенного числа а и цифры 3. 
Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no». 
 */

public class Task03 {

	public static void main(String[] args) {
		
		int toCompare = 3;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите целое число:");
		System.out.print(">>> ");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено не число! Попробуйте снова.");
			System.out.print(">>> ");
		}
		System.out.println("==============================================");
		
		int a = sc.nextInt();
		
		System.out.println("Меньше ли число " + a + ", чем " + toCompare + " ?");

		if(a < toCompare) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
