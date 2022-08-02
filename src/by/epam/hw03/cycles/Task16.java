package by.epam.hw03.cycles;

/*16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). */

public class Task16 {

	public static void main(String[] args) {
		
		int n = 3; // 1+2
		long result = n;
		
		for (int i = 3; i <= 10; i++) {
			n += i;
			result *= n;
		}
		
		System.out.println(result);

	}

}
