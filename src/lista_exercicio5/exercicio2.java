package lista_exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	/*
	 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
	 * imposto) Em seguida, mostrar os dados do funcionário (nome e salári liquido).
	 * Em seguida, aumentar o salario do funcionário com base em uma porcentagem dada
	 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados
	 * do funcionário.
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
