package mx.com.cetech.clase10.interfaces;

public class Interfaces {

	public static void main(String[] args) 
	{
	/*
	 * UNA INTERFACE ES UN TIPO DE REFERENCIA, SIMILAR A UNA CLASE QUE PUEDE CONTENER
	 * CONSANTES, FIRMAS DE METODOS(SIN CUERPO)
	 * 
	 * LAS CLASES QUE IMPLEMENTA LAS INTERFACES PROPORCIONAN, UN CUERPO AL METODO
	 * PARA QUE CADA UNO DE LOS METODOS DE LA INTERFACE TENGA SU IMPLEMENTACION	
	 */

		PrimerGrado primerGrado = new PrimerGrado();
		
		primerGrado.suma();
		primerGrado.fraccionesSimples();
		primerGrado.area();
		
		SextoGrado sextoGrado = new SextoGrado();
		
		sextoGrado.divicion();
		
		
		
	
	}
}
