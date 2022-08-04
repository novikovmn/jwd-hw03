package by.epam.hw03.cycle;

/*15. Вычислить : 1+2+4+8+...+ 2 в 10 степени*/

public class Task15 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += (int) Math.pow(2, i);
		}

		System.out.println(sum);
		
		
	

	}

}
