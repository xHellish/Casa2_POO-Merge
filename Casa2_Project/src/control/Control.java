package control;
import Habitaciones.Cocina;
import Habitaciones.Habitacion;

public class Control {

	public static void main(String[] args) {

		//objetos de habitaciones
		Cocina kitchen = new Cocina();
		Habitacion hab = new Habitacion();

		//objetos de control
		SuspenderAguaLuz SAL = new SuspenderAguaLuz();
		EnsuciarHabitacion EH = new EnsuciarHabitacion();

		SAL.isSuspenderAgua();
		SAL.setSuspenderAgua(kitchen.abrirGrifo());
		SAL.isSuspenderAgua();

		EH.isEnsuciarHabitacion();
		EH.setHabitacion(hab.ensuciar());
		EH.isEnsuciarHabitacion();



		
	}

	

}


	