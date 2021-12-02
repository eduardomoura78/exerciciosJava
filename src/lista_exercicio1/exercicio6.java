package lista_exercicio1;

import java.util.Scanner;

public class exercicio6 {
	/*
	 * Fazer um programa que leia três valores com ponto flutuante de dupla
	 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
	 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
	 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
	 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
	 * e B
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double trianguloRetangulo = (A * C)/2;
		double circulo = 3.14159 * C;
		double trapezio = ((A + B) * C) / 2;
		double quadrado = B * B;
		double retangulo = A * B;

		System.out.println("A área do triângulo retângulo é :" + trianguloRetangulo);
		System.out.println("A área do círculo é :" + circulo);
		System.out.println("A área do trapezio é :" + trapezio);
		System.out.println("A área do quadrado é :" + quadrado);
		System.out.println("A área do retangulo é :" + retangulo);

		sc.close();

	}

}
