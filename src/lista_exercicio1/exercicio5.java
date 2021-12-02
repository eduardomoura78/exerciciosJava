package lista_exercicio1;

import java.util.Scanner;

public class exercicio5 {
	/*
	 * Fazer um programa para ler o código de uma peça 1, 
	 * o número de peças 1, o valor unitário de cada peça 1, 
	 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
	 * Calcule e mostre o valor a ser pago
	 * 
	 * */

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int cod1 = sc.nextInt();
		int numPec1 = sc.nextInt();
		double valorPec1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int numPec2 = sc.nextInt();
		double valorPec2 = sc.nextDouble();		
		
		double valPec1 = numPec1 * valorPec1;
		double valPec2 = numPec2 * valorPec2;
		double soma = valPec1 + valPec2;

		System.out.printf("O valor total da compra é :"+soma);

		sc.close();

	}

}
