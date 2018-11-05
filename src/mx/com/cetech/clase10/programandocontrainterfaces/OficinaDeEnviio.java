package mx.com.cetech.clase10.programandocontrainterfaces;

import java.util.ArrayList;

public class OficinaDeEnviio {

	//PROGRMANDO CONTRA IMPLEMENTACION
	
	ServiciosDeEnvioElectronico servicioDeEnvioElectronico = new ServiciosDeEnvioElectronico();
	// ServiciosDeEnvioPostal servicioDeEnvioPostal = new
	
	//PROGRMANDO CONTRA INTERFACE

	ServiciosDeEnvio servicioDeEnvio = new ServiciosDeEnvioPostal() {
		
		@Override
		public void enviar(String mensaje) {
			// TODO Auto-generated method stub
			
		}
	};
	
	ArrayList<String> mensajes = new ArrayList<String>();

	public void envioUrgente(String mensaje) {
		
servicioDeEnvio.enviar(mensaje);
		
	}

	public void envioNormal(String mensaje) {
		
		mensajes.add(mensaje);
		if(mensajes.size() >10){
			enviarTodo();
		}
	}

	public void enviarTodo() {

		for (String x: mensajes){
			
			servicioDeEnvio.enviar(x);
		}
		mensajes = new ArrayList<String>();
	}

}
