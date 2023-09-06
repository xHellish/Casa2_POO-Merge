package control;

public class TaquearTuberias {
	
	private boolean TaquearTuberia;
	
	public TaquearTuberias() {
		TaquearTuberia = false;
	}
	
	public String isTaquearTuberia() {
		if (TaquearTuberia == true) {
			System.out.println("La tuberia esta taqueada");
			return "La tuberia esta taqueada";
		}
		else {
			System.out.println("La tuberia no esta taqueada");
			return "La tuberia no esta taqueada";
		}
	}

	public void setTaqueo(boolean codigo){
		if(codigo == true){
			TaquearTuberia = true;
		}
		else{
			TaquearTuberia = false;
		}
	}
}