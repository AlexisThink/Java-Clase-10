package mx.com.cetech.clase10.clasesabstractas;

public class ClaseProgramador extends CalcularSuma{

		@Override
		int getSuma() {
			int numeroUno, numeroDos, resultado;
			
			numeroUno=5;
			numeroDos=10;
			
			resultado=numeroUno + numeroDos;
			
			return resultado;
			
		}
	}
