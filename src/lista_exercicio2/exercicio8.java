package lista_exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
	/*
	 * Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em
	 * pagar seus impostos, pois sabem que nele não existem políticos corruptos e os
	 * recursos arrecadados são utilizados em benefício da população, sem qualquer
	 * desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia um valor com
	 * duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em
	 * seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de
	 * Renda, segundo a tabela abaixo
	 * 
	 * 0 --R$2000 - isento 2000.01 -- R$3000 - 8% 3000.01 -- R$4500 - 18% acima de
	 * R$4500 - 28%
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario, imposto = 0.0, faixa2, faixa3;

		System.out.print("Digite o seu salário: ");
		salario = sc.nextDouble();
		
		if (salario >= 2000.01 && salario <= 3000) {
			
			imposto = ((salario - 2000.00) * 0.08);

    	 } else {
    		 if (salario > 3000.01 && salario < 4500.01) {
    			 
    			 faixa2 = 1000 * 0.08;
				 imposto = ((salario - 3000.00) * 0.18);
				 imposto = imposto + faixa2;
				 

       		 } else {
       			 if (salario > 4500.01) {
       				 
       				 faixa2 = 1000 * 0.08; //2 a 3 mil
					 faixa3 = 1500 * 0.18; //3 a 4.5 mil
					 salario = salario - 4500;
					 imposto = salario * 0.28;
					 imposto = imposto + faixa2 + faixa3;
				  } else {
					  if (salario > 0.0 && salario <= 2000.00) {

						imposto = 0.0;
     				  }
 				  }
			  }
		  }
    	  System.out.printf("imposto é: " + imposto + "");

    	  sc.close();
    }

}