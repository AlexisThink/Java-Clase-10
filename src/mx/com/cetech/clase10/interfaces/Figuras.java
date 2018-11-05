package mx.com.cetech.clase10.interfaces;

public class Figuras {

	int perimetro = 16;
	int ancho = 15;
	int alto = 32;
	
	public void area (){
		System.out.println("El area es: " + (alto*ancho));
	}
	
	public void perimetro (){
		System.out.println("El perimetro es: " + (alto+ancho));
	}
	
	
	
}
