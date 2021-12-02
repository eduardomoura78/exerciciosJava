package lista_exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
	/*
	 * Fazer um programa para ler os valores da altura e largura de um retângulo.
	 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
	 * Usar uma classe como mostrado no projeto ao lado.
	 * */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and  heigth: ");
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();
		
		System.out.println("Area : "+rectangle.Area());
		System.out.println("Perimeter : "+rectangle.Perimeter());
		System.out.println("Diagonal: "+rectangle.Diagonal());
	
		sc.close();	
	}
}
