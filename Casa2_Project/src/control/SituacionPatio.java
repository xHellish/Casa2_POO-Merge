package control;

public class SituacionPatio {
	
	private boolean SueloSaturarse;
	private boolean PasarAguaPorVentana;
	
	public SituacionPatio() {
		
		SueloSaturarse = false;
		PasarAguaPorVentana = false;
	}
	
	public String isSueloSaturarse() {
		if (SueloSaturarse == true) {
			return "El suelo esta saturado";
		}
		else {
			return "el suelo no esta saturado";
		}
	}
	
	public String isPasarAguaVentana() {
		if (PasarAguaPorVentana == true) {
			return "El agua pasa por la ventana";
		}
		else {
			return "el agua no pasa por la ventana";
		}
	}
	
	
}

