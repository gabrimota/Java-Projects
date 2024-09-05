import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
			System.out.print("Digite um Número: ");
				num = teclado.nextInt();
		if(num % 2 == 0) {
			System.out.printf("O %d é par!" , num);
		} else {
			System.out.printf("O %d é impar!" , num);
		}

	}
}