package by.epam.hw03.cycles;

/*9. Найти сумму квадратов первых ста чисел. 
*/

public class Task09 {

	public static void main(String[] args) {
		
		int totalSum = 0;
		
		for (int i = 0; i <= 99; i++) {
			int sqr = i*i;
			totalSum += sqr;
		}
		
		System.out.println("Сумма квадратов первых ста чисел = " + totalSum);
		
	}

}
