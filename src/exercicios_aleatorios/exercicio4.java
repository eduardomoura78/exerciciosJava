package exercicios_aleatorios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	/*
	 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
	 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
	 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
	 * cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
	 * abaixo de X, quando houver, conforme exemplo.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor da linha:");
		int linha = sc.nextInt();
		System.out.println("Entre com o valor da coluna:");
		int coluna = sc.nextInt();
		int[][] mat = new int[linha][coluna];

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				sc.nextLine();
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println("");
		}

		System.out.println("Entre com um valor:");
		int valor = sc.nextInt();

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (mat[i][j] == valor) {
					System.out.println("Position :" + (i+1) + "," + (j+1));

					if (j - 1 >= 0) {
						System.out.println("Left :" + mat[i][j - 1]);
					}
					if (j + 1 < coluna) {
						System.out.println("Right:" + mat[i][j + 1]);//ok
					}
					if (i - 1 >= 0) {
						System.out.println("Up :" + mat[i - 1][j]);
					}
					if (i + 1 < linha) {
						System.out.println("Down :" + mat[i + 1][j]);//ok
					}
				}
			}
		}
	}
}
