package ex5;

import java.util.Scanner;

public class Ex5 {
    /*Crie um programa que receba duas notas, se a média for maior
    que 5 mostre aprovado, se reprovado, recebe mais uma nota,
    retira a menor das duas notas, refaz a média e se maior que 5
    mostre aprovado, senão, mostre reprovado.*/
    
    public static void main(String[] args) {
        float n1, n2, media, novaNota, mediaNova;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Digite sua primeira nota: ");
        n1 = scanner.nextFloat();
         
        System.out.print("Digite sua segunda nota: ");
        n2 = scanner.nextFloat();
        
        // Calcula a média inicial
        media = (n1 + n2) / 2;
         
        // Verifica se o aluno já passou
        if(media > 5) {
            System.out.println("Parabéns! Você passou!");
        } else {
            // Se a média for menor ou igual a 5, ele faz uma nova prova
            System.out.print("Recuperação. Digite sua nova nota: ");
            novaNota = scanner.nextFloat();
            
            // Substitui a menor nota pela nova nota
            if(novaNota > n1 && n1 < n2) {
                mediaNova = (novaNota + n2) / 2;
            } else if(novaNota > n2 && n2 < n1) {
                mediaNova = (novaNota + n1) / 2;
            } else {
                // Se a nova nota não for maior que nenhuma das duas, use a maior nota antiga
                mediaNova = (n1 > n2 ? n1 : n2) + novaNota / 2;
            }
            
            // Verifica se o aluno passou após a nova média
            if(mediaNova > 5) {
                System.out.println("Parabéns! Agora você passou!");
            } else {
                System.out.println("Tem que melhorar! você foi reprovado.");
            }
        }
    }
}
