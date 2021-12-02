package lista_exercicio2;

import java.util.Scanner;

public class exercicio6 {
	/*
	 * Você deve fazer um programa que leia um valor qualquer e apresente uma
	 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
	 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
	 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor;
		String intervalo ="";
		
		System.out.print("Digite o valor: ");
		valor = sc.nextInt();

		if (valor >=0 && valor <= 25) {
			
			//intervalo = "[0,25]";
			intervalo ="O valor "+valor+" está no intervalo entre [0,25]";
		} else {
			if (valor > 25 && valor <= 50) {

				//intervalo = "(25,50]";
				intervalo ="O valor "+valor+" está no intervalo entre (25,50]";
				
			} else {
				if (valor > 50 && valor <= 75) { 

					//intervalo = "(50,75]";
					intervalo ="O valor "+valor+" está no intervalo entre (50,75]";

				} else {
					if (valor > 75 && valor <= 100) {

						//intervalo = "(75,100]";
						intervalo ="O valor "+valor+" está no intervalo entre (75,100]";
					} else {
						if (valor > 100) {

							//intervalo = "Fora dos intervalos";
							intervalo ="O valor "+valor+" está fora dos intervalos";
						}
					}
				}
			}
		}

     	System.out.printf(intervalo);

		sc.close();

	}

}
