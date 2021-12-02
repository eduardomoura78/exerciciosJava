package lista_exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	/*
	 * Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e
	 * mostre a divis�o do primeiro pelo segundo. Se o denominador for igual a zero,
	 * mostrar a mensagem "divisao impossivel".
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		int X;
		double valor1 = 0, valor2 = 0,div =0;
		
		System.out.println("Quantidade de n�meros: ");
		X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			
			System.out.println("Valor 1: ");
			valor1 = sc.nextDouble();

			System.out.println("Valor 2: ");
			valor2 = sc.nextDouble();
			
			if (valor2 == 0) {
				
		     	System.out.println("Divis�o imposs�vel.");
			}else {
				div = valor1/valor2;
	     	    System.out.println(div);	     	
         }
		}
		sc.close();
	}

}
