package by.epam.hw03.cycle;

/*  
36.  Два  двузначных  числа,  записанных  одно  за  другим  ,  образуют  четырёхзначное  число,  которое 
делится на их произведение. Найти эти числа. 
 */

public class Task36 {

	public static void main(String[] args) {

		int from = 10;
		int to = 99;

		for (int i = from; i <= to; i++) {
			for (int j = from; j <= to; j++) {
				String twoNumbersTogether = String.valueOf(i) + String.valueOf(j);
				int fourDigitsNumber = Integer.parseInt(twoNumbersTogether);
				if (fourDigitsNumber % (1 * j) == 0) {
					System.out.printf("Число %d делится на произведение %d и %d и состоит из них.\n", fourDigitsNumber, i, j);
				}

			}
		}

	}

}
