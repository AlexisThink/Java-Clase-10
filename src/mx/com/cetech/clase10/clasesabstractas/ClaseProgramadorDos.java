package mx.com.cetech.clase10.clasesabstractas;

public class ClaseProgramadorDos extends CalcularSuma {

	@Override
	int getSuma() {
int numeroUno, numeroDos, resultado;
		
		numeroUno=20;
		numeroDos=10;
		
		resultado=numeroUno + numeroDos;
		
		return resultado;
		
	}

}
