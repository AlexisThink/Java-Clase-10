package mx.com.cetech.clase10.clasesabstractas;

public class ClaseMetodoAbstracto {
	
	/*
	 * UNA CLASE ABSTRACTA ES UNA CLASE QUE SE DECLARA ABSTRCTA
	 * QUE PUEDE O NO INCLUIR METODOS ABSTRACTOS
	 * UNA CLASE ABSTRATA NO PUEDE SER INSTANCIADA PERO PUEDE TENER SUBLASES
	 * 
	 * UN METODO ABSTRATO SE DECLARA SIN APLICACION (SIN LLAVES Y SEGUIDO DE UN PUNTO Y COMA)
	 * 
	 * SI UNA CLASE INCLUYE UN METODO ABSTRACTO LA PROPIA CLASE DEBE SER DECLARADA COMO ABSTRACTA
	 * 
	 * LA CLASE PROGRAMADOR VA A SR UTILIZADAPARA PERSONALIZAR EL METODO ABSTRCTO A SU MANERA 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main (String[] args){
		
		ClaseProgramador claseProgramador = new ClaseProgramador();
		
		claseProgramador.imprimirResultado();
		
		ClaseProgramadorDos claseProgramadorDos = new ClaseProgramadorDos();
		claseProgramadorDos.imprimirResultado();
	}
	
	
	
}
