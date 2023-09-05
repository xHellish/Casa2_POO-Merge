package funcionamiento;
import control.Util;

public class Cesped extends Vegetacion{
	
	public Cesped(int pSize) {
		super(pSize);
	}
	
	
	public void Reducir_Tamaño() {
		Util.report("cesped disminuyó un centimetro");
		tamano -= 1;
	}
	@Override
	protected void loadMyTasks() {
		tasks.add("levantarse");
		tasks.add("trabajar");
		tasks.add("comer");
		tasks.add("descansar");
	}
}
