package by.epam.hw03.cycles;

/*19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или 
равен заданному е. Общий член ряда имеет вид:
	an = (1/(2^n)) + (1/(3^n)) 
*/

public class Task19 {

	public static void main(String[] args) {
		
		int from = 1;
		int to = 7;
		double e = 0.256;
		double sum = 0;
		
		
		for (int n = from; n <= to; n++) {
			double an = (1/Math.pow(2, n)) + (1/Math.pow(3, n));
			if(Math.abs(an) >= e) {
				sum += an;
			}
		}
		
		System.out.println("Сумма = " + sum);
		

	}

}
