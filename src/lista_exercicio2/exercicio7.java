package lista_exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
	/*
	 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
	 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
	 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
	 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
	 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
	 * situação.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double X, Y;
		String intervalo = "";

		System.out.print("Digite o valor de X: ");
		X = sc.nextDouble();

		System.out.print("Digite o valor de Y: ");
		Y = sc.nextDouble();

		if (X == 0.0 && Y == 0.0) {

			intervalo = "O ponto está na origem.";
		} else {
			if (X > 0.0 && Y > 0.0) {

				intervalo = "O ponto está no quadrante 1.";

			} else {
				if (X > 0 && Y < 0.0) {

					intervalo = "O ponto está no quadrante 4.";

				} else {
					if (X < 0.0 && Y > 0.0) {

						intervalo = "O ponto está no quadrante 2.";
					} else {
						if (X <0.0 && Y < 0.0) {

							intervalo = "O ponto está no quadrante 3.";							
						}
					}
				}
			}
		}

		System.out.printf(intervalo);

		sc.close();
	}
}
