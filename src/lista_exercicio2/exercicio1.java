package lista_exercicio2;

import java.util.Scanner;

public class exercicio1 {
	/*
	 * Fazer um programa para ler um n�mero inteiro, e depois dizer
	 * se este n�mero � negativo ou n�o. 
	 * */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero:");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			if(numero > 0) {
				System.out.println("N�O NEGATIVO");
				
			}else {
				if (numero == 0) {
					System.out.println("N�O NEGATIVO");
				}
			}
		}
		
		sc.close();
	}

}
