import java.util.Scanner;

public class Ex8 {

	// Conversor de Celsius para Fahrenheit em Java
	
	public static void main(String[] args) {
		float celsius, fahrenheit;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Conversor de Celsius para Fahrenheit");
		System.out.print("Digite a temperatura em Celsius: ");
			celsius = scanner.nextFloat();
		
			fahrenheit = (float) (celsius * 1.8 + 32);
		System.out.printf("A temperatura é %.0f Fahrenheit" , fahrenheit);

		
	}

}
