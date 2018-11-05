package mx.com.cetech.clase10.clasesabstractas;

abstract class CalcularSuma {

	abstract int getSuma();

	public void imprimirResultado() {
		System.out.println("El resultado de la suma: " + getSuma());
	}

}
