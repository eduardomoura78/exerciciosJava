package lista_exercicio1;

import java.util.Scanner;

public class exercicio2 {
	/*
	 * Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o
	 * valor da �rea deste c�rculo com quatro casas decimais.
	 * 
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * raio;
		System.out.printf("A �rea do circulo com raio %.2f%n �: %.2f%n", raio, area);

		sc.close();

	}

}
