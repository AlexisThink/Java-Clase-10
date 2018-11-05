package mx.com.cetech.clase10.polimorfismo;

public class MetodosSobrecargados {
	
	public static void main (String [] args){
		/*
		 * EN JAVA ES POSIBLE TENER 2 O MAS METODOS DE LA MISMA CLASE
		 * QUE COMPARTAN EL MISMO NOMBRE, SIEMPRE Y CUANDO SU DECLARACION 
		 * DE PARAMETROS SEA DIFERENTE.
		 * 
		 * METODOS SOBRECARGADOS: ES UNA MANERA QUE JAVA IMPLEMENTE EL POIMORFISMO,
		 * CUANDO SE INVOCA UN METODO SOBRECARGADO JAVA UTILIZA EL TIPO O
		 * EL NUMERO DE AGUMENTOS EN EL METODO COMO GUIA PARA DETERMINAR
		 * QUE VERSION DEL METODO SOBRE CRGADO ES EL QUE ESTA LLAMANDO
		 */
		
		CalcularSuma calcularSuma = new CalcularSuma();
		
		calcularSuma.encontrarSuma("Alexis",5,10);
		
		
		
		
		
	}

}
