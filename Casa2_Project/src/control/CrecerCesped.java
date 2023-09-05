package control;

public class CrecerCesped {
	
	private boolean  Crecer;
	
	public CrecerCesped() {
		
		Crecer = false;
	}

	public String isCrecer() {
		
		if(Crecer == true) {
			return "El zacate esta creciendo";
		}
		else {
			return "el zacate no esta creciendo";
		}
	}

	
}
