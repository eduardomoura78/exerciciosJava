package lista_exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
	/*
	 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
	 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
	 * de 0 é 1.
	 * 
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int X,fat=1;		
		System.out.println("Número a ser feito o fatorial: ");
		X = sc.nextInt();

		for (int i = 1; i < X; i++) {
			fat = fat * (X-i);
		}
		fat = fat*X;
 	    System.out.println(fat);
		sc.close();
	}
}
