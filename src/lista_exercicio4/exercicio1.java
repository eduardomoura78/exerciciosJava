package lista_exercicio4;

import java.util.Scanner;

public class exercicio1 {
	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1
	 * at� X, um valor por linha, inclusive o X, se for o caso.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X;	

		System.out.println("Digite um valor entre 1 e 1000:");
		X = sc.nextInt();
		
		if (X>=1 && X <=1000) {
			
			for (int i=0;i<=X;i++) {
				
				if (i%2!=0) {
					
					System.out.println(i);
				}
			}
				
		} else
			System.out.println("O valor de X n�o est� entre os valores 1 e 1000.");
		sc.close();
	}

}
