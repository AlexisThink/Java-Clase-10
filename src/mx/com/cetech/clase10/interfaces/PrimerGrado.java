package mx.com.cetech.clase10.interfaces;

public class PrimerGrado extends Figuras  implements FuncionesMatematicas, Fracciones
{

	@Override
	public void suma() {
		
		System.out.println("Resultado de la suma: " + (a+b));
		
	}

	@Override
	public void resta() {

		System.out.println("Resultado de la resta: " + (a-b));
		
	}

	@Override
	public void divicion() {

		System.out.println("Resultado de la divicion: " + (a/b));
		
	}

	@Override
	public void multiplicacion() {
		
		System.out.println("Resultado de la multiplicacion: " + (a*b));
		
	}

	@Override
	public void fraccionesSimples() {

		System.out.println("El resultado de la fraccion es: " + (x/y));
		
	}

	@Override
	public void fraccionesAnzadas() {


		
	}

}
