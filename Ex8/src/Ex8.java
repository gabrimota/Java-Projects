import java.util.Scanner;

public class Ex8 {

	// Conversor de Celsius para Fahrenheit em Java
	
	public static void main(String[] args) {
		float celsius, fahrenheit;
		int celsiusOuFahrenheit;
		Scanner scanner = new Scanner (System.in);
		System.out.printf("Digite 1 para celsius e 2 para fahrenheit:  ");
		celsiusOuFahrenheit = scanner.nextInt();
		
		switch(celsiusOuFahrenheit) {
		
		case 1: 
			System.out.println("Conversor de Celsius para Fahrenheit");
			System.out.print("Digite a temperatura em Celsius: ");
				celsius = scanner.nextFloat();
				
				fahrenheit = (float) (celsius * 1.8 + 32);
					System.out.printf("A temperatura é %.0f Fahrenheit" , fahrenheit);
						
					break;
		case 2:
			System.out.println("Conversor de Fahrenheit para Celsius");
			System.out.print("Digite a temperatura em Fahrenheit: ");
			fahrenheit = scanner.nextFloat();
				
				celsius = (float) ((float) (fahrenheit - 32) / 1.8);
					System.out.printf("A temperatura é %.0f Celsius" , celsius);
					break;
		
		
		} 
		
	}

}
