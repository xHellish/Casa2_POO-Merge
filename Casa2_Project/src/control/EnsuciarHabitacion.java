package control;

public class EnsuciarHabitacion {
	private boolean Ensuciar;
	
	public EnsuciarHabitacion() {
		Ensuciar = false;
	}
	
	public String isEnsuciarHabitacion() {
		if (Ensuciar == true) {
			System.out.println("La habitacion esta limpia");
			return "La habitacion esta limpia";
		}
		else {
			System.out.println("La habitacion esta sucia");
			return "La habitacion esta sucia";
		}
	}

	public void setHabitacion(boolean codigo){
		if(codigo == true){
			Ensuciar = true;
		}
		else{
			Ensuciar = false;
		}
	}
}
