import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numEscolhido;
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número entre 1 e 10( Digite um número > 5 e veja oque acontece): ");
        numEscolhido = scanner.nextInt();

        switch (numEscolhido) {
            case 1:
                System.out.print("Um");
                break;
            case 2:
                System.out.print("Dois");
                break;
            case 3:
                System.out.print("Três");
                break;
            case 4:
                System.out.print("Quatro");
                break;
            case 5:
                System.out.print("Cinco");
                break;
            case 6:
                System.out.print("Seis ");

            case 7:
                System.out.print("Sete ");

            case 8:
                System.out.print("Oito ");

            case 9:
                System.out.print("Nove ");

            case 10:
                System.out.print("Dez ");
                break;
            default:
                System.out.println("Número Invalido ");

        }

    }
}