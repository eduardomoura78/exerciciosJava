package lista_exercicio4;

import java.util.Scanner;

public class exercicio2 {
	/*
	 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X
	 * que ser�o lidos em seguida. Mostre quantos destes valores X est�o dentro do
	 * intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas
	 * informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e
	 * "out" para fora do intervalo).
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X ,in = 0, out = 0;
		int Y;

		System.out.println("Digite um valor inteiro:");
		X = sc.nextInt();

		for (int i = 1; i <= X; i++) {

			System.out.println("Digite um valor inteiro:");
			Y = sc.nextInt();

			if (Y >= 10 && Y <= 20) {

				in = in + 1;
			} else {
				out = out + 1;
			}
		}

		System.out.println(in+" in");
		System.out.print(out+" out");
		sc.close();

	}

}
