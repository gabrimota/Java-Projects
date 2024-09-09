import java.util.Scanner;

public class Ex6 {
	
	/*Faça um programa que receba seu salário (double) e mostre o valor do
	imposto sobre ele, o valor descontado e o valor líquido.
	Se o seu salario for abaixo de 1000, não desconta nada.
	Se o seu salario for entre 1000 e 2000, desconta 7%
	Se o seu salario for entre 2000 e 3000, desconta 15%
	Se o seu salario for entre 3000 e 4000, desconta 22%
	Se o seu salario for acima de 4000, desconta 29%
	 */
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, desconto;
		// usamos o scanner para guardamos oque o usuario digitar
		Scanner scanner = new Scanner(System.in);
		
		// pegando a informaçao do salário
		System.out.print("Digite o seu salário: ");
		salario = scanner.nextDouble();
		
		// utilizando estruturas condicionais para saber qual taxa deveremos aplicar no salario do usuario
		if(salario < 1000) {
			System.out.printf("Não havéra nenhum desconto em seu salário");
		} else if( salario >=1000 && salario <= 2000) {
			desconto = (salario * 7 )/ 100;
			System.out.printf("Desconto de 7%% de seu salário: %.2f\n", desconto);
				System.out.printf("Seu salário liquido: %.2f ", (salario - desconto));
			
		} else if( salario >=2000 && salario <= 3000) {
			desconto = (salario * 15 )/ 100;
			System.out.printf("Desconto de 15%% de seu salário: %.2f\n", desconto);
				System.out.printf("Seu salário liquido: %.2f ", (salario - desconto));
	} else if( salario >=3000 && salario <= 4000) {
		desconto = (salario * 22 )/ 100;
		System.out.printf("Desconto de 22%% de seu salário: %.2f\n", desconto);
			System.out.printf("Seu salário liquido: %.2f ", (salario - desconto));
	} else if( salario > 4000) {
		desconto = (salario * 29 )/ 100;
			System.out.printf("Desconto de 29%% de seu salário: %.2f\n", desconto);
				System.out.printf("Seu salário liquido: %.2f ", (salario - desconto));
}

}
}

