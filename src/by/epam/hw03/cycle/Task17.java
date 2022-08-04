package by.epam.hw03.cycle;

/*17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1) 
*/

public class Task17 {

	public static void main(String[] args) {
		
		double a = 2.0;
		int n = 5;
		
		double result = a;
		
		for (int i = 1; i < n; i++) {
			result *= a + i;
		}
		System.out.println("Произведение = " + result);
		
		
		 
	

	}

}
