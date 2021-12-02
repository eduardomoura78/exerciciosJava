package lista_exercicio1;

import java.util.Scanner;

public class exercicio2 {
	/*
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	 * valor da área deste círculo com quatro casas decimais.
	 * 
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * raio;
		System.out.printf("A área do circulo com raio %.2f%n é: %.2f%n", raio, area);

		sc.close();

	}

}
