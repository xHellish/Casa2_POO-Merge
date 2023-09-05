package funcionamiento;

import java.util.ArrayList;

public class Suelo {
	public ArrayList<String> tasks_suelo;
	private int tamano;
	private boolean saturado=false;
	
	public Suelo(int pSize) {
		tamano = pSize;
		tasks_suelo = new ArrayList<String>();
	}
	
	public void Saturarse() {
		saturado = true;
	}
	
	public void Desaturarse() {
		saturado = false;
	}

	public boolean isSaturado() {
		return saturado;
	}

	
	
}