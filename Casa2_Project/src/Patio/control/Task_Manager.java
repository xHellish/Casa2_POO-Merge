package control;

import funcionamiento.*;

public class Task_Manager {
	public Clase_Padre control;
	public Task_Manager(Clase_Padre pControl) {
		control = pControl;
	}
	public void EnviarPlagasInsectos(Vegetacion elemento) {
		Util.report("Se envian plagas al patio");
		control.EnviarPlaga(elemento);
	}
	
	public void CrecerCesped(Vegetacion cesped) {
		Util.report("El cesped crece");
		control.Crecer_Cesped(cesped);
	}
	
	public void SaturarSuelo(Suelo elemento_suelo) {
		Util.report("Se satura el suelo");
		elemento_suelo.Saturarse();
		
	}
	
	public void SituacionPatio(Vegetacion objeto) {
		Util.report("Se obtiene la situacion del patio");
		Util.report("Fumigación: " + objeto.isFumigado());
		Util.report("Plaga: " + objeto.isPlaga());
		Util.report("Riego: " + objeto.isRiego());
	}
	
	public void PasarAguaVentana() {
		Util.report("El agua pasa por la ventana");
		
	}
}