package lista_exercicio1;

import java.util.Scanner;

public class exercicio3 {
	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
	 * segundo a fórmula: DIFERENCA = (A * B - C * D)
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		double DIFERENCA;
		DIFERENCA = (A * B - C * D);
		System.out.println("DIFERENCA = " + DIFERENCA);
		sc.close();
	}

}
