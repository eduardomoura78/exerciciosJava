package lista_exercicio1;

import java.util.Scanner;

public class exercicio4 {
	/*
	 * Fazer um programa que leia o número de um funcionário, 
	 * seu número de horas trabalhadas, o valor que recebe por
	 * hora e calcula o salário desse funcionário. A seguir, mostre o número e 
	 * o salário do funcionário, com duas casas decimais
	 * 
	 * */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int func = sc.nextInt();
		double horas = sc.nextDouble();
		double valorHoras = sc.nextDouble();
		double salario = horas * valorHoras;
		System.out.printf("O funcionário %d tem o salário de: $ %.2f%n  ",func, salario);
	
		sc.close();


	}

}
