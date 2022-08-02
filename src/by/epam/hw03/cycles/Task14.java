package by.epam.hw03.cycles;

/*14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 * */

public class Task14 {

	public static void main(String[] args) {
		
		int nominator = 1;
		double sum = 0;
		for (int n = 1; n <= 7; n++) {
			sum += (double)nominator/n;
		}
		
		
		System.out.println(sum);

	}

}
