package by.epam.hw03.cycle;

import java.math.BigInteger;

/*11. Составить программу нахождения разности кубов первых двухсот чисел */

public class Task11 {

	public static void main(String[] args) {

		BigInteger difference = BigInteger.valueOf(0);

		for (int i = 0; i <= 199; i++) {
			difference = difference.subtract(BigInteger.valueOf((long) Math.pow(i, 3)));
		}
		
		System.out.println("Разность кубов первых двухсот чисел = " + difference);

		

		
	}

}
