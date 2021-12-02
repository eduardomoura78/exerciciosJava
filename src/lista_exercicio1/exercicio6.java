package lista_exercicio1;

import java.util.Scanner;

public class exercicio6 {
	/*
	 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
	 * precis�o: A, B e C. Em seguida, calcule e mostre: a) a �rea do tri�ngulo
	 * ret�ngulo que tem A por base e C por altura. b) a �rea do c�rculo de raio C.
	 * (pi = 3.14159) c) a �rea do trap�zio que tem A e B por bases e C por altura.
	 * d) a �rea do quadrado que tem lado B. e) a �rea do ret�ngulo que tem lados A
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

		System.out.println("A �rea do tri�ngulo ret�ngulo � :" + trianguloRetangulo);
		System.out.println("A �rea do c�rculo � :" + circulo);
		System.out.println("A �rea do trapezio � :" + trapezio);
		System.out.println("A �rea do quadrado � :" + quadrado);
		System.out.println("A �rea do retangulo � :" + retangulo);

		sc.close();

	}

}
