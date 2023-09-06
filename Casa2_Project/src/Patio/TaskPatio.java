package Patio;

import java.util.ArrayList;


public class TaskPatio implements Itask{
	Task_Manager manager;
	Clase_Padre manager_padre;
	ArrayList<Vegetacion> listaElementos;
	ArrayList<Suelo> listaElementos_suelo;
	
	public TaskPatio(Clase_Padre control, ArrayList<Vegetacion> listaV, ArrayList<Suelo> listaS) {
		manager = new Task_Manager(control);
		manager_padre = new Clase_Padre();
		listaElementos = listaV;
		listaElementos_suelo = listaS;
	}

	@Override
	public void execute(Action pAction, GUI frame) {
		if (pAction==Action.EnviarPlagasInsectos) {
			for (Vegetacion elemento: listaElementos){
				manager.EnviarPlagasInsectos(elemento);
				frame.decirAccion("5", "Enviar plagas de insectos");
			}
			
		}
		if (pAction==Action.CrecerCesped) {
			for(Vegetacion elemento: listaElementos) {
				if (elemento.getClass() == Cesped.class) {
					System.out.println(elemento.getClass().getSimpleName());
					manager.CrecerCesped(elemento);
				}
			}
		}
		if (pAction==Action.PasarAguaVentana) {
				manager_padre.Pasar_Agua_Ventana();
			}
		if (pAction==Action.SituacionPatio) {
			for (Vegetacion elemento: listaElementos){
				manager.SituacionPatio(elemento);
			}
		}
		if (pAction==Action.SaturarSuelo) {
			for (Suelo elemento: listaElementos_suelo){
				manager.SaturarSuelo(elemento);
			}
			
		}
		
		
	}

}
