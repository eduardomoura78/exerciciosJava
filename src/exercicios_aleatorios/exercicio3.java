package exercicios_aleatorios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
	
	/*
	 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e
	 * salario) de N funcion�rios. N�o deve haver repeti��o de id. Em seguida,
	 * efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
	 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o
	 * existir, mostrar uma mensagem e abortar a opera��o. Ao final, mostrar a
	 * listagem atualizada dos funcion�rios, conforme exemplos. Lembre-se de aplicar
	 * a t�cnica de encapsulamento para n�o permitir que o sal�rio possa ser mudado
	 * livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
	 * aumento por porcentagem dada.
	 */
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();		

		for (int i = 1; i <= n; i++) {
			System.out.println("");
			System.out.println("Employee #"+ i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist.");
		}else {
			System.out.print("Enter the percentage:");
			double perc = sc.nextDouble();
			emp.IncreaseSalary(perc);
		}
		
		if (emp!=null) {
			System.out.print("");
			System.out.println("List of Employees:");
			System.out.println("");
			for (Employee obj : list) {
				System.out.println(obj);
			}
		}		
	}
}
