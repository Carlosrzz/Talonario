package TalonarioConsola;


import TalonarioConsola.model.Talonario;
import TalonarioConsola.services.TalonarioServiceImpl;

public class TalonarioConsola {

	public static void main(String[] args) {
	    System.out.println("hola");

	    // 1. Creamos el objeto con la información
	    Talonario talonario = new Talonario();
	    talonario.setCarnet("RC101423");
	    talonario.setDescripcion("Matricula, cuota 1");
	    talonario.setFecha("2026-03-21"); // Formato recomendado para BD
	    talonario.setEstado("A");

	    // 2. Usamos el Servicio para mandarlo a MySQL
	    TalonarioServiceImpl servicio = new TalonarioServiceImpl();
	    servicio.guardar(talonario); 
	}

}
