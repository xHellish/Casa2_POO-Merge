package control;
import Habitaciones.Cocina;
import Habitaciones.Habitacion;
import Habitaciones.Bano;

public class Control {

	public static void main(String[] args) {

		//objetos de habitaciones
		Cocina kitchen = new Cocina();
		Habitacion hab = new Habitacion();
		Bano Ba = new Bano();

		//objetos de control
		SuspenderAguaLuz SAL = new SuspenderAguaLuz();
		EnsuciarHabitacion EH = new EnsuciarHabitacion();
		TaquearTuberias TT = new TaquearTuberias();

		SAL.isSuspenderAgua();
		SAL.setSuspenderAgua(kitchen.abrirGrifo());
		SAL.isSuspenderAgua();

		EH.isEnsuciarHabitacion();
		EH.setHabitacion(hab.ensuciar());
		EH.isEnsuciarHabitacion();


		TT.isTaquearTuberia();
		TT.setTaqueo(Ba.jalarCadena());
		TT.isTaquearTuberia();


		
	}

	

}


	