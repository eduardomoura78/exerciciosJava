package lista_exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
	/*
	 * Ler um número inteiro N e calcular todos os seus divisores.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int X;		
		System.out.print("Número : ");
		X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			
			if ((X%i)==0) {
				
				System.out.println(i);				
			}		
		} 	    
		sc.close();
	}

}
