package mx.com.cetech.clase10.programandocontrainterfaces;

public class ServiciosDeEnvioElectronico implements ServiciosDeEnvio  {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Desde envio electronico: " + mensaje);
		
	}

}
