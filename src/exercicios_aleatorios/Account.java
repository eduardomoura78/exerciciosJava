package exercicios_aleatorios;

public class Account {
	
	private String name;
	private int number;
	private double deposit;
	
	public String getName() {
		return name;
	}
	public Account(String name, int number, double deposit) {
		super();
		this.name = name;
		this.number = number;
		this.deposit = deposit;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double AddDeposit(double deposit) {
		return this.deposit = this.deposit + deposit;
	}
	public double WithDraw (double withDraw) {
		return this.deposit - withDraw - 5;
	}
	
}
