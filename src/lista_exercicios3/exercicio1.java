package lista_exercicios3;

import java.util.Scanner;

public class exercicio1 {
	/*
	 * Escreva um programa que repita a leitura de uma senha at� que ela seja
	 * v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta � o valor 2002.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = 0;

		System.out.print("Digite a senha : ");
		senha = sc.nextInt();

		while (senha != 2002) {
			
			System.out.println("Senha inv�lida");
			System.out.print("Digite a senha : ");
			senha = sc.nextInt();		
		}
		System.out.println("Acesso permitido");
		sc.close();
	}
}
