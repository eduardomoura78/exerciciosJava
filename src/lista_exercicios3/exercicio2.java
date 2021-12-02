package lista_exercicios3;

import java.util.Scanner;

public class exercicio2 {
	/*
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
	 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
	 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
	 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
	 * alguma).
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X, Y;
		String quadrante = "";

		System.out.print("Digite o valor de X: ");
		X = sc.nextInt();

		System.out.print("Digite o valor de Y: ");
		Y = sc.nextInt();

		while (X != 0 || Y != 0) {
			
			if (X > 0 && Y > 0) {
			
				quadrante = "primeiro";
				
			}else if (X > 0 && Y < 0) {
				
				quadrante = "quarto"; 
				
			}else if (X < 0 && Y < 0) {
				
				quadrante = "terceiro";
				
			}else if (X < 0 && Y > 0) {
				
				quadrante = "segundo";
		
			}
			System.out.println(quadrante);

			System.out.print("Digite o valor de X: ");
			X = sc.nextInt();

			System.out.print("Digite o valor de Y: ");
			Y = sc.nextInt();
		}

		sc.close();
	}
}
