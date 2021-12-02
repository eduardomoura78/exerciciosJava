package lista_exercicios3;

import java.util.Scanner;

public class exercicio3 {
	/*
	 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a
	 * prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de
	 * combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina
	 * 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de
	 * 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa
	 * ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
	 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
	 * tipo de combust�vel, conforme exemplo.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo, gasolina = 0, alcool = 0, diesel = 0;

		System.out.print("Digite o c�digo: ");
		codigo = sc.nextInt();

		while (codigo != 4) {

			if (codigo == 1) {
				gasolina += 1;
			} else if (codigo == 2) {
				alcool += 1;
			} else if (codigo == 3) {
				diesel += 1;
			} else if (codigo > 4) {

				System.out.println("C�digo inv�lido.");
			}
			System.out.print("Digite outro c�digo: ");
			codigo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Alcool: " + alcool);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
