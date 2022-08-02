package by.epam.hw03.cycles;

import java.math.BigInteger;

/*10. Составить программу нахождения произведения квадратов первых двухсот чисел. 
*/

public class Task10 {

	public static void main(String[] args) {

		BigInteger result = BigInteger.valueOf(1);
		for(int i = 1; i <= 200; i++) {
		    result = result.multiply(BigInteger.valueOf((long) i * i));
		}
		System.out.println(result);
		

	}

}
