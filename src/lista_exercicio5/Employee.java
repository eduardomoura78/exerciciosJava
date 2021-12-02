package lista_exercicio5;

public class Employee {
	
	String Name;
	double GrossSalary;
	double Tax;
	
	public double NetSalary() {
		
		return GrossSalary - Tax;
	}
	
	public double IncreaseSalary(double percentage) {
			
		return ((GrossSalary * percentage)/100);		
	}
}
