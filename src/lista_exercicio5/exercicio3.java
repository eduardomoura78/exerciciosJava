package lista_exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
	/*
	 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
	 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e o
	 * terceiro valem 35 cada). Ao final, mostrar qual nota final do aluno no ano.
	 * Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso
	 * negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado
	 * (que é 60% da nota). Voce deve criar uma classe Student para resolver esse
	 * problema.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name: ");
		student.Name = sc.next();
		
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println("Final grade : "+student.CalcGrade(student.grade1, student.grade2, student.grade3));
		if (student.CalcGrade(student.grade1, student.grade2, student.grade3) >= 60.00) {
			
			System.out.print("PASS");
			
		}else {
			
			System.out.println("FAILED");
			double missing;
			missing = 60.00 - student.CalcGrade(student.grade1, student.grade2, student.grade3); 
			System.out.printf("MISSING %.2f POINTS",missing);
			
		}	
		sc.close();
	}

}
