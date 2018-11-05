package mx.com.cetech.clase10.programandocontrainterfaces;

public class Principal {

	public static void main(String[] args) 
	{
	
		OficinaDeEnviio oficinaDeEnvio = new OficinaDeEnviio();
		
		oficinaDeEnvio.envioUrgente("Para todos #MSG: Todos pasan");
		
		oficinaDeEnvio.envioNormal("Prueba de Envio Normal");
		oficinaDeEnvio.envioNormal("Prueba2");
		
		oficinaDeEnvio.enviarTodo();
	}

}
