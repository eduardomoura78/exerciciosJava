package lista_exercicio1;

import java.util.Scanner;

public class exercicio4 {
	/*
	 * Fazer um programa que leia o n�mero de um funcion�rio, 
	 * seu n�mero de horas trabalhadas, o valor que recebe por
	 * hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e 
	 * o sal�rio do funcion�rio, com duas casas decimais
	 * 
	 * */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int func = sc.nextInt();
		double horas = sc.nextDouble();
		double valorHoras = sc.nextDouble();
		double salario = horas * valorHoras;
		System.out.printf("O funcion�rio %d tem o sal�rio de: $ %.2f%n  ",func, salario);
	
		sc.close();


	}

}
