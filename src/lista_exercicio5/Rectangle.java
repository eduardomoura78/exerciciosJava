package lista_exercicio5;

public class Rectangle {
	
	double Width;
	double Height;
	
	public double Area () {
		
		return Width * Height;
	}
	
	public double Perimeter () {
		
		return 2*(Width + Height); 
	}
	
	public double Diagonal () {
		
		return Math.sqrt((Width*Width) + (Height*Height));		 
	}

}
