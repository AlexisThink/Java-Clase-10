package mx.com.cetech.clase10.polimorfismo;

public class CalcularSuma {

	// en esta clase creamos el metodo encontrarSuma()
	// TODOS ESTOS METODOS TIENEN EL MISMO NOMBRE PERO TIENEN DIFERENTES
	// DECLACIONES DE PARAMTROS

	public void encontrarSuma() {
		System.out.println("Sin Argumentos!!!!");

	}

	public void encontrarSuma(String patito) {
		
		System.out.println("Un argumento String" + patito);

	}

	public void encontrarSuma(int numero) {
		System.out.println("El resultado de la suma es: "+ (numero + 5));

	}

	public void encontrarSuma(int x, int y) {
		
		System.out.println("El resultado de la suma es: " + ( x + y));

	}

	public void encontrarSuma(String nombre, int nUno, int nDos) {

		System.out.println("Hola" + nombre + nUno + nDos);
		
		
	}

	public void encontrarSuma(boolean isRespuesta) {
		
		if(isRespuesta){
			System.out.println("Es verdadera");
		}
		
		else{
			System.out.println("Nel pastel");
		}
	}

}
