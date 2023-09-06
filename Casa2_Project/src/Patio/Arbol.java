package Patio;

public class Arbol extends Vegetacion{
	
	//atributos
	private String tipo;
	private boolean frutal;
	private int edad = 0;
	
	public Arbol(String pNombre, String pTipo, boolean pFrutal, int pSize) {
		super(pNombre, pSize);
		this.tipo = pTipo;
		this.frutal = pFrutal;
	}
	//funciones
	public void incEdad() {
		this.edad++;
	}

	@Override
	protected void loadMyTasks() {
		tasks.add("crece");
		tasks.add("es regado");
		tasks.add("es fumigado");
		tasks.add("es secado");
	}
}
