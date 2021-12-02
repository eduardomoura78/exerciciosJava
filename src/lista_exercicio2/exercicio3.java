package lista_exercicio2;

import java.util.Scanner;

public class exercicio3 {
	/*
	 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
	 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;

		System.out.print("Digite o primeiro n�mero:");
		A = sc.nextInt();

		System.out.print("Digite o segundo n�mero:");
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {

			System.out.print("N�meros m�ltiplos.");
		} else
			System.out.print("N�meros n�o m�ltiplos.");

		sc.close();

	}

}
