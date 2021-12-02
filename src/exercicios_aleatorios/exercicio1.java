package exercicios_aleatorios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	/*
	 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o
	 * n�mero da conta, o nome do titular, e o valor de dep�sito inicial que o
	 * titular depositou ao abrir a conta. Este valor de dep�sito inicial ,
	 * entretanto, � opcional, ou seja,: Se o titular n�o tiver dinheiro a depositar
	 * no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
	 * inicial da conta ser�, naturalmente, zero.
	 * 
	 * Importante: Uma vez que uma conta banc�ria foi aberta, o n�mero da conta
	 * nunca poder� ser alterado. J� o nome do titular pode ser alterado (pois uma
	 * pessoa pode mudar de nome por ocasi�o de casamento, por exemplo).
	 * 
	 * Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver
	 * um mecanismo para proteger isso. O saldo s� aumenta por meio de dep�sitos, e
	 * s� diminui por meio de saque realizado, o banco cobra uma taxa de $5.00.
	 * Nota: a conta pode ficar com saldo negativo se o saldo n�o for suficiente
	 * para realizar os saque e/ou pagar a taxa.
	 * 
	 * Voc� deve fazer um programa que realize o cadastro de uma conta, dando a
	 * op��o para que seja ou n�o informado o valor de dep�sito inicial. Em seguida,
	 * realizar um dep�sito e depois um saque, sempre mostrando os dados da conta
	 * ap�s a opera��o.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");		
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		String name = sc.next();
		
		System.out.print("Is there an initial deposit (y/n)?");
		String YorN = sc.next();
		double deposit;
		if (YorN.toUpperCase() == "y" ) {
			System.out.print("Enter initial deposit value: ");
			 deposit = sc.nextDouble();		
		}else {
			deposit =0;
		}		
		Account account = new Account(name,number, deposit);
		
		account.setNumber(number);
		account.setName(name);
		account.setDeposit(deposit);
		
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder %s, Balance %.2f",account.getNumber(),account.getName(),account.getDeposit());
		System.out.println("");
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		System.out.println("Update account data: ");
		double NewValue = account.AddDeposit(deposit);
		account.setDeposit(NewValue);
		System.out.printf("Account %d, Holder %s, Balance %.2f",account.getNumber(),account.getName(),account.getDeposit());
		System.out.println("");
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		System.out.println("");
		System.out.println("Updated  account data:");
        System.out.printf("Account %d, Holder %s, Balance %.2f",account.getNumber(),account.getName(),account.WithDraw(withdraw));
		sc.close();
	}
}
