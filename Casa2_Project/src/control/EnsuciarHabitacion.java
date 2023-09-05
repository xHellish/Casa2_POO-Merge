package Control;

public class EnsuciarHabitacion {
	private boolean Ensuciar;
	
	public EnsuciarHabitacion() {
		Ensuciar = false;
	}
	
	public String isEnsuciarHabitacion() {
		if (Ensuciar == true) {
			return "La habitacion esta limpia";
		}
		else {
			return "La habitacion esta sucia";
		}
	}
}
