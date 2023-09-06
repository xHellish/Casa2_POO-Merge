package control;
import Habitaciones.Administrador;
import Habitaciones.Cocina;

public class Control {

	public static void main(String[] args) {


		Cocina kitchen = new Cocina();
		SuspenderAguaLuz SAL = new SuspenderAguaLuz();

		SAL.isSuspenderAgua();
		SAL.setSuspenderAgua(kitchen.abrirGrifo());
		SAL.isSuspenderAgua();



		
	}

	

}


	