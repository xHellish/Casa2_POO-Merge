package funcionamiento;

public class Planta extends Vegetacion{
	private String tipo;
	
	public Planta(String pTipo, int pSize) {
		super(pSize);
		this.tipo = pTipo;
	}
	@Override
	protected void loadMyTasks() {
		tasks.add("levantarse");
		tasks.add("trabajar");
		tasks.add("comer");
		tasks.add("descansar");
	}
	
}
