package by.epam.hw03.cycle;

/*4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 
включительно. 
*/

public class Task04 {

	public static void main(String[] args) {
		
		int from = 2;
		int to = 100;
		while(from <= to) {
			if(from % 2 == 0) {
				System.out.print(from + " ");
			}
			from++;
		}

	}

}
