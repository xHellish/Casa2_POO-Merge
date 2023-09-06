package Patio;

public class Cesped extends Vegetacion{
	
	public Cesped(String pNombre, int pSize) {
		super(pNombre, pSize);
	}
	

	@Override
	protected void loadMyTasks() {
		tasks.add("crece");
		tasks.add("es regado");
		tasks.add("es fumigado");
		tasks.add("es secado");
		tasks.add("es cortado");
	}
}
