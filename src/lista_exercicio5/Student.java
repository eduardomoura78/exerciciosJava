package lista_exercicio5;

public class Student {

	String Name;
	double grade1; // vale 30%
	double grade2; // vale 35%
	double grade3; // vale 35%;

	public double CalcGrade(double grade1, double grade2, double grade3) {

		return grade1 + grade2 + grade3;
	}
	
	public double MissingGrade(double grade1, double grade2, double grade3) {
		
		return grade1 - grade2 - grade3; 
	}

}
