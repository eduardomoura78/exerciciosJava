package lista_exercicio2;

import java.util.Scanner;

public class exercicio4 {
	/*
	 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
	 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
	 * uma duração mínima de 1 hora e máxima de 24 horas.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, soma = 0, hora = 0;

		System.out.print("Hora início:");
		horaInicial = sc.nextInt();

		System.out.print("Hora final:");
		horaFinal = sc.nextInt();
		
		if (horaFinal < horaInicial) {
			
			hora = 24 + horaFinal;
			soma = hora - horaInicial;		
		}
		if (horaInicial < horaFinal ) {
			
			soma = horaFinal - horaInicial;
		}
		if (horaInicial == horaFinal) {
			soma = 24;
		}

		System.out.print("O total de horas é: "+soma+" horas");

		sc.close();
	}
}
