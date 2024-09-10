import java.util.Scanner;

public class Ex7 {
	/* Faça um programa que receba seu salário (double) e uma nota entre 0 e 10.
	Se o valor da nota for igual ou abaixo de 2, o salario permanece o mesmo.
	Se o valor da nota for entre 2 e 4, o salario tem um aumento de 5%
	Se o valor da nota for entre 4 e 6, o salario tem um aumento de 10%
	Se o valor da nota for entre 6 e 8, o salario tem um aumento de 15%
	Se o valor da nota for entre 8 e 10, o salario tem um aumento de 20%
	No final o salário deverá ser apresentado com o valor de entrada e com o
	aumento.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, aumento;
		int nota;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		salario = scanner.nextDouble();
		
		System.out.print("Digite a nota: ");
			nota = scanner.nextInt(); 
			
		if(nota == 2) {
			
			System.out.print("O seu salário permanece o mesmo! ");
	
	}else if(nota >= 2 && nota <= 4) {
		
		aumento = (salario * 5 )/ 100;
		System.out.printf("Aumento de 5%% de seu salário: %.2f\n", aumento);
			System.out.printf("Seu salário liquido: %.2f ", (salario + aumento));
			
	}else if(nota >= 4 && nota <= 6 ) {
		
		aumento = (salario * 10 )/ 100;
		System.out.printf("Aumento de 10%% de seu salário: %.2f\n", aumento);
			System.out.printf("Seu salário liquido: %.2f ", (salario + aumento));
			
	}else if(nota >= 6 && nota <= 8) {
		
		aumento = (salario * 15 )/ 100;
		System.out.printf("Aumento de 15%% de seu salário: %.2f\n", aumento);
			System.out.printf("Seu salário liquido: %.2f ", (salario + aumento));
			
	}else if(nota >= 8 && nota <= 10) {
		
		aumento = (salario * 20 )/ 100;
		System.out.printf("Aumento de 20%% de seu salário: %.2f\n", aumento);
			System.out.printf("Seu salário liquido: %.2f ", (salario + aumento));
	}

  }
}