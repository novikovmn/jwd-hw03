package by.epam.hw03.cycle;

import java.util.Scanner;

/*27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и 
самого числа. m и n вводятся с клавиатуры. 
*/

public class Task27 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Введите целое число m (должно быть > 3):");		
		System.out.print("> ");
		int m = s.nextInt();
		
		System.out.println("Введите целое число n (должно быть > 3):");
		System.out.print("> ");
		int n = s.nextInt();
		
		if(m <= 3 || n <= 3) {
			System.out.println("Число m и n должны быть больше трех!.");
			return;
		}
		
		if(m >= n) {
			System.out.println("Число m должно быть меньше, чем n.");
			return;
		}
		
		System.out.println();
		System.out.println("Работаем...");
		System.out.println();

		for (int i = m; i <= n; i++) {
			for (int j = i - 1; j > 1; j--) {
				if (i % j == 0) {
					System.out.printf("Единственный подходящий делитель для %d -> %d.\n", i, j);
				} else {
					System.out.printf("Число %d не делится без остатка на %d.\n", i, j);

				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Конец!");
		
		
	}

}
