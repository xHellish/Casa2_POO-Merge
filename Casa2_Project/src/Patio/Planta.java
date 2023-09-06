package Patio;

public class Planta extends Vegetacion{
	private String tipo;
	
	public Planta(String pNombre, String pTipo, int pSize) {
		super(pNombre, pSize);
		this.tipo = pTipo;
	}
	@Override
	protected void loadMyTasks() {
		tasks.add("crece");
		tasks.add("es regado");
		tasks.add("es fumigado");
		tasks.add("es secado");
	}
	
}
