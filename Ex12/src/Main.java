
import java.util.Scanner;

public class Main {
    /* Ex12
        Faça um programa que receba seu salario (double) e uma nota entre 1 a 5.
    Se o valor da nota for igual abaixo de 1, o salario permanece o mesmo.
    Se o valor da nota for entre 2, o salario tem um aumento de 5%
    Se o valor da nota for entre 3, o salario tem um aumento de 10%
    Se o valor da nota for entre 4, o salario tem um aumento de 15%
    Se o valor da nota for entre 5, o salario tem um aumento de 20%
        */
    public static void main(String[] args) {
        int nota;
        double salario, aumento;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        // Utilizando o scanner para recebermos oque o usuario digitar, guardamos o valor digitado na var salario
            salario = scanner.nextDouble();
        System.out.print("Digite sua nota: ");
            nota = scanner.nextInt();

            if( nota <=1){
                System.out.println("O seu salário continua o mesmo!");

            } else if(nota <= 2 ){
                aumento = (salario * 0.05);
                System.out.println("Aumento de 5%");
                System.out.printf("R$%.2f", salario + aumento);

            } else if( nota <= 3){
                aumento = (salario * 0.1);
                System.out.println("Aumento de 10%");
                System.out.printf("R$%.2f", salario + aumento);
            }


    }
}