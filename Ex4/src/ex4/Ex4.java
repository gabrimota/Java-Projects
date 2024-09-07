package ex4;

import java.util.Scanner;

public class Ex4 {
	
	/*Crie um programa que receba 4 números e mostre o maior e o
	menor recebido.*/
	
	public static void main(String[] args) {
		int n1 , n2 ,n3 ,n4;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numéro 1 :");
			n1 = scanner.nextInt();
		
		System.out.print("Digite o numéro 2 :");
			n2 = scanner.nextInt();
		
		System.out.print("Digite o numéro 3 :");
			n3 = scanner.nextInt();
		
		System.out.print("Digite o numéro 4 :");
			n4 = scanner.nextInt();
			
		if ( n1 > n2 && n1>n3 && n1>n4) {
			System.out.printf(" %d é o maior número entre os 4 \n", n1);
		} 
		if ( n1 < n2 && n1 < n3 && n1 < n4) {
			System.out.printf(" %d é o menor número entre os 4 \n", n1);
		} 
		if( n2 > n1 && n2>n3 && n2>n4) {
			System.out.printf(" %d é o maior número entre os 4 \n", n2);
		} 
		if( n2 < n1 && n2 < n3 && n2 < n4) {
			System.out.printf(" %d é o menor número entre os 4 \n", n2);
		} 
		if( n3 > n1 && n3>n2 && n3>n4) {
			System.out.printf(" %d é o maior número entre os 4 \n", n3);
		} 
		if( n3 < n1 && n3 < n2 && n3 < n4) {
			System.out.printf(" %d é o menor número entre os 4 \n", n3);
		} 
		if( n4 > n1 && n4 > n2 && n4 > n3) {
			System.out.printf(" %d é o maior número entre os 4 \n", n4);
		}
		if( n4 < n1 && n4 < n2 && n4 < n3) {
			System.out.printf(" %d é o menor número entre os 4 \n", n4);
		}
	}
}
