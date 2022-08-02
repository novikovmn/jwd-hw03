package by.epam.hw03.branches;

import java.util.Random;

/*33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в 
базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют 
следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — 
доступен модуль базы С. 
*/

public class Task33 {

	public static void main(String[] args) {

		int[] passwords = { 9583, 1747, 3331, 7922, 9455, 8997 }; // пароли
		int totalEmployee = 6; // количество работников

		Random r = new Random();
		int index = r.nextInt(totalEmployee);

		// при каждом новом запуске пароль будет "случайный" из массива
		int password = passwords[index]; 
		System.out.printf("Пароль = %d\n", password);

		switch (password) {
		case 9583:
		case 1747:
			System.out.println("Доступны базы A, B, C.");
			break;
		case 3331:
		case 7922:
			System.out.println("Доступны базы B, C.");
			break;
		case 9455:
		case 8997:
			System.out.println("Доступна база C.");
			break;
		default:
			System.out.println("В доступе отказано. Неверный пароль.");

		}

	}

}
