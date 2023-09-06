package Patio;
import java.util.ArrayList;


public class Clase_Padre {
	private boolean rain;
	
	public Clase_Padre() {	
	}
	
	public ArrayList<Vegetacion> start() {
		ArrayList<Vegetacion> vegetacion = new ArrayList<Vegetacion>();
		Planta planta1 = new Planta("planta1", "Helecho", 5);
		vegetacion.add(planta1);
		Planta planta2 = new Planta("planta2", "Rosal", 2);
		vegetacion.add(planta2);
		Cesped cesped = new Cesped("cesped", 20);
		vegetacion.add(cesped);
		Arbol arbol1 = new Arbol("arbol1", "Roble", false, 10);
		vegetacion.add(arbol1);
		Arbol arbol2 = new Arbol("arbol2", "Manzano", true, 7);
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
		planta.setRiego(true);
	}
	
	public void EnviarPlaga(Vegetacion elemento) {
		Util.report("Enviando plaga");
		elemento.setPlaga(true);
	}
	
	public void Crecer_Cesped(Vegetacion cesped) {
		Util.report("Crecer el cesped");
		cesped.Crecer();
	}
	
	public void Cortar_Cesped(Cesped cesped) {
		Util.report("Cortando el cesped");
		cesped.reducirTamano();;
	}
	
	public void Fumigar(Vegetacion objeto){
		objeto.setPlaga(false);
		objeto.Ser_Fumigado();
		Util.report("Fumigando la vegetación");
	}
	
	public void Check_Estatus(){
		Util.report("Revisando el estado del patio");
	}
	
	public void Desaturar(Suelo pSuelo){
		boolean status1 = pSuelo.isSaturado();
		rain = false;
		Util.report("El suelo se desatura");
		if (status1 == false) {
			Util.report("El suelo no está saturado");
		}else {
			Util.report("El suelo está saturado");
		}
		pSuelo.Desaturarse();
		Util.report("Ahora el suelo está desaturado");
	}
	
	public void Saturar(Suelo psuelo){
		boolean status1 = psuelo.isSaturado();
		rain = true;
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
