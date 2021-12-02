package lista_exercicio2;

import java.util.Scanner;

public class exercicio5 {
	/*
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
	 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double preco =0, total;

		System.out.println("Digite o código: ");
		codigo = sc.nextInt();

		System.out.print("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			
			preco = 4.00;
			
		} else {
			if (codigo == 2) {
				
				preco = 4.50;
			} else {
				if (codigo == 3) {
					
					preco = 5.00;
				} else {
					if (codigo == 4) {
						
						preco = 2.00;						
					} else {
						if (codigo == 5) {
							
							preco = 1.50;
						}
					}
				}
			}
		}
		
		total = (quantidade * preco);
		
		System.out.print("O total é: R$ "+total+"");

		sc.close();
	}

}
