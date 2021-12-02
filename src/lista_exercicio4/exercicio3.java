package lista_exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
	/*
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
	 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
	 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
	 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
	 * o terceiro valor tem peso 5.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int X;
		double valor1 = 0, valor2 = 0, valor3 = 0, media = 0;
		
		System.out.println("Quantidade de casos: ");
		X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			
			System.out.println("Valor 1: ");
			valor1 = sc.nextDouble();
			valor1 = valor1*2;
			System.out.println("Valor 2: ");
			valor2 = sc.nextDouble();
			valor2 = valor2*3;
			System.out.println("Valor 3: ");
			valor3 = sc.nextDouble();
			valor3 = valor3*5;
			media = ((valor1+valor2+valor3)/10);
	     	System.out.printf("A média ponderada é %.1f%n:",media);	
         }	
		sc.close();
	}	

}
