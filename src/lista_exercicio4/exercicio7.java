package lista_exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
	/*
	 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve
	 * ent�o mostrar na tela N linhas, come�ando de 1 at� N. Para cada linha,
	 * mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
	 * exemplo.
	 * 
	 * 1 1 1
	 * 2 4 8
	 * 3 9 27
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int X, quadrado, triplo;		
		System.out.print("N�mero : ");
		X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			
			quadrado = i*i;
			triplo = i*i*i;
			
			System.out.printf("%d %d %d%n",i,quadrado,triplo);					
		} 	    
		sc.close();
	}
}
