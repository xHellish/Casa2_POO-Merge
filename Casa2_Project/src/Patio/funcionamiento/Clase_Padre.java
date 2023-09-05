package funcionamiento;
import java.util.ArrayList;

import control.*;

public class Clase_Padre {
	private boolean rain;
	
	public Clase_Padre() {	
	}
	
	public ArrayList<Vegetacion> start() {
		ArrayList<Vegetacion> vegetacion = new ArrayList<Vegetacion>();
		Planta planta1 = new Planta("Helecho", 5);
		vegetacion.add(planta1);
		Planta planta2 = new Planta("Rosal", 2);
		vegetacion.add(planta2);
		
		Cesped cesped = new Cesped(20);
		vegetacion.add(cesped);
		Arbol arbol1 = new Arbol("Roble", false, 10);
		vegetacion.add(arbol1);
		Arbol arbol2 = new Arbol("Manzano", true, 7);
		vegetacion.add(arbol2);
		return vegetacion;
	}
	
	public ArrayList<Suelo> start_suelo(){
		ArrayList<Suelo> lista_suelo = new ArrayList<Suelo>();
		Suelo suelo = new Suelo(30);
		lista_suelo.add(suelo);
		return lista_suelo;
	}
	
	public void Regar_Plantas(Planta planta) {
		Util.report("Regando la planta");
	}
	
	public void EnviarPlaga(Vegetacion elemento) {
		elemento.setPlaga(true);
		String elementoTamano = String.valueOf(elemento.getTamano());
		Util.report(elementoTamano);
		
	}
	
	public void Crecer_Cesped(Vegetacion cesped) {
		Util.report("Crecer el cesped");
		String elementoTamano = String.valueOf(cesped.getTamano());
		Util.report(elementoTamano);
		cesped.Crecer();
		String elementoTamano2 = String.valueOf(cesped.getTamano());
		Util.report(elementoTamano2);
	}
	
	public void Cortar_Cesped(Cesped cesped) {
		Util.report("Cortando el cesped");
		cesped.Reducir_Tamaño();
	}
	
	public void Fumigar(Vegetacion objeto){
		objeto.setPlaga(false);
		objeto.setFumigado(true);
		Util.report("Fumigando la vegetación");
	}
	
	public void Check_Estatus(){
		Util.report("Revisando el estado del patio");
	}
	
	public void Desaturar(){
		Util.report("El suelo se desatura");
	}
	
	public void Saturar(Suelo psuelo){
		boolean status1 = psuelo.isSaturado();
		Util.report("El suelo se satura");
		if (status1 == false) {
			Util.report("El suelo no está saturado");
		}else {
			Util.report("El suelo está saturado");
		}
		psuelo.Saturarse();
		Util.report("Ahora el suelo está saturado");
	}
	
	public void Pasar_Agua_Ventana(){
		Util.report("El agua pasa por la ventana");
	}
}