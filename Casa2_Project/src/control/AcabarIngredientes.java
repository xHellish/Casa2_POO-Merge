package Control;

public class AcabarIngredientes {
	
	private boolean QuitarObjetos;
	
	public AcabarIngredientes() {
		QuitarObjetos = false;
	}
	
	public String isAcabarIngredientes() {
		if(QuitarObjetos == true) {
			return "Hay ingredientes";
		}
		else {
			return "No hay ingredientes";
		}
	}
}
