package lista_exercicio2;

import java.util.Scanner;

public class exercicio1 {
	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer
	 * se este número é negativo ou não. 
	 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			if(numero > 0) {
				System.out.println("NÃO NEGATIVO");
				
			}else {
				if (numero == 0) {
					System.out.println("NÃO NEGATIVO");
				}
			}
		}
		
		sc.close();
	}

}
