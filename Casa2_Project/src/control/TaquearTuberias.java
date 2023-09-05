package control;

public class TaquearTuberias {
	
	private boolean TaquearTuberia;
	
	public TaquearTuberias() {
		TaquearTuberia = false;
	}
	
	public String isTaquearTuberia() {
		if (TaquearTuberia == true) {
			return "La tuberia esta taqueada";
		}
		else {
			return "La tuberia no esta taqueada";
		}
	}
}