package exercicios_aleatorios;

public class Rent {
	
	private String Name;
	private String Email;
	
		
	public String toString() {
		return Name + ", " + Email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Rent(String name, String email) {		
		Name = name;
		Email = email;
	}
}
