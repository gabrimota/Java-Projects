import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numEscolhido;
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número entre 1 e 10: ");
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
                    System.out.print("Seis");
                    break;
                case 7:
                    System.out.print("Sete");
                    break;
                case 8:
                    System.out.print("Oito");
                    break;
                case 9:
                    System.out.print("Nove");
                    break;
                case 10:
                    System.out.print("Dez");
                    break;
                default:
                    System.out.println("Número Invalido");

            }

    }
}