package by.epam.hw03.branch;

/*24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное 
данное количество лепестков n. 
*/

public class Task24 {

	public static void main(String[] args) {
		
		loveOrNot(7);

	}
	
	public static void loveOrNot(int n) {
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.println("любит");
			}
			
			if(i % 2 == 0) {
				System.out.println("не любит");
			}
		}
	}

}
