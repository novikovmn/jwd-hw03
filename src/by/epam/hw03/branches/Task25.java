package by.epam.hw03.branches;

/*25.  Написать  программу  —  модель  анализа  пожарного  датчика  в  помещении,  которая  выводит  сообщение 
«Пожароопасная ситуация », если температура в комнате превысила 60° С.*/

public class Task25 {

	public static void main(String[] args) { 
		
		double temperature = 70.0;
		
		if(temperature > 60) {
			System.out.println("Пожароопасная ситуация!");
		}else {
			System.out.println("Температура <= 60 радусов.");
		}

	}

}
