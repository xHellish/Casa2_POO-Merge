package funcionamiento;

public class Arbol extends Vegetacion{
	
	//atributos
	private String tipo;
	private boolean frutal;
	private int edad = 0;
	
	public Arbol(String pTipo, boolean pFrutal, int pSize) {
		super(pSize);
		this.tipo = pTipo;
		this.frutal = pFrutal;
	}
	//funciones
	public void incEdad() {
		this.edad++;
	}

	@Override
	protected void loadMyTasks() {
		tasks.add("regar plantas");
		tasks.add("trabajar");
		tasks.add("comer");
		tasks.add("descansar");
	}
}
