package ex3;
// importação do scanner para utilizar ele
import java.util.Scanner;

public class Ex3 {
	/*Crie um programa que receba 2 números e um operador (+, -. *,/) e faça a respectiva operação.*/

	public static void main(String[] args) {
		// variaveis inteiras
		int num , num2 , somas;
		// variaveis strings criada para guardar os sinal de cada operação
		String sinal;
		String soma = "+";
		String sub = "-";
		String mult= "*";
		String div = "/";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
			num = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
			num2 = scanner.nextInt();	
			
		System.out.print("Digite o sinal da operação: ");
			sinal = scanner.next();
			
		if(sinal.equals(soma) ) {
			System.out.printf("A soma dos números deu: %d", (num + num2));
		} if(sinal.equals(sub) ) {
			System.out.printf("A subtração dos números deu: %d", (num - num2));
		} if(sinal.equals(mult) ) {
			System.out.printf("A multiplicação dos números deu: %d", (num * num2));
		} if(sinal.equals(div) ) {
			System.out.printf("A divisão dos números deu: %d", (num / num2));
		} 
		
	}

}
