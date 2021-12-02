package lista_exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	/*
	 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e
	 * imposto) Em seguida, mostrar os dados do funcion�rio (nome e sal�ri liquido).
	 * Em seguida, aumentar o salario do funcion�rio com base em uma porcentagem dada
	 * (somente o sal�rio bruto � afetado pela porcentagem) e mostrar novamente os dados
	 * do funcion�rio.
	 */

	public static void main(String[] args) {
		
		double Salary;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.Name = sc.next();
		System.out.print("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		Salary =employee.NetSalary(); 
		System.out.println("Employee : "+employee.Name+"$ "+Salary);
		System.out.println("");
		System.out.print("Wich percentage to increase salary : ");
		double percentage = sc.nextDouble();
		System.out.print("");
		Salary = Salary + employee.IncreaseSalary(percentage); 
		System.out.println("Update data: "+Salary);
	
		sc.close();	

	}

}
