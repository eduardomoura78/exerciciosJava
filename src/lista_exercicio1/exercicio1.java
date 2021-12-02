package lista_exercicio1;

import java.util.Scanner;

public class exercicio1 {
	/*
	 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
	 * soma desses números com uma mensagem explicativa.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();

		int soma;
		soma = numero1 + numero2;
		System.out.println("SOMA = " + soma);

		sc.close();

	}

}
