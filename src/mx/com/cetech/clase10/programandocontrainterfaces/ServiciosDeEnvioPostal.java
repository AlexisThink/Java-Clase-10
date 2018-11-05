package mx.com.cetech.clase10.programandocontrainterfaces;


public class ServiciosDeEnvioPostal implements ServiciosDeEnvio {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Desde envio postal: " + mensaje);

	}

}
