package exercicios_aleatorios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
	/*
	 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
	 * esses quartos identificados pelos n�meros 0 a 9. Fazer um programa que inicie
	 * com todos os dez quartos vazios, e depois leia uma quantidade N representando
	 * o n�mero de estudantes que v�o alugar quartos (N pode ser de 1 a 10). Em
	 * seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel,
	 * informar o nome e email do estudante, bem como qual dos quartos ele escolheu
	 * (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa
	 * deve imprimir um relat�rio de todas ocupa��es do pensionato, por ordem de
	 * quarto, conforme exemplo.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int rented = sc.nextInt();

		for (int i = 1; i <= rented; i++) {
			System.out.println("");
			System.out.println("Room #"+ i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}

		System.out.println("Busy rooms:");
		System.out.println("");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + " : " + vect[i]);
			}
		}
		sc.close();
	}
}
