package lista_exercicio1;

import java.util.Scanner;

public class exercicio5 {
	/*
	 * Fazer um programa para ler o c�digo de uma pe�a 1, 
	 * o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, 
	 * o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. 
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

		System.out.printf("O valor total da compra � :"+soma);

		sc.close();

	}

}
