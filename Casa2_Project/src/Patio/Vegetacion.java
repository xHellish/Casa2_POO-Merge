package Patio;
import java.util.ArrayList;

public class Vegetacion {
	public ArrayList<String> tasks;
	protected String nombre;
	protected int tamano;
	protected boolean plaga=false;
	protected boolean riego=false;
	protected boolean fumigado=false;
	
	
	//Funciones
	public Vegetacion(String pNombre, int pSize) {
		tasks = new ArrayList<String>();
		nombre = pNombre;
		tamano = pSize;
		loadMyTasks();
	}
	public void Crecer(){
		tamano += 1;
		Util.report("Creció un centimetro");
	}
	
	public void Ser_Fumigado(){
		fumigado=true;
		Util.report("Todo está fumigado");
	}
	public int getTamano() {
		return tamano;
	}
	public void reducirTamano() {
		tamano-=1;
		Util.report("Se redujo en un centímetro");
	}
	public boolean isPlaga() {
		return plaga;
	}
	public void setPlaga(boolean pPlaga) {
		plaga = pPlaga;
	}
	public void setRiego(boolean pRiego) {
		riego = pRiego;
	}
	public boolean isRiego() {
		return riego;
	}
	public boolean isFumigado() {
		return fumigado;
	}
	
	public void process(Task pTask) {
		for(String task : tasks) {
			
			if ( task.compareTo(pTask.getTaskname())==0 && !pTask.isProcesada()) 
			{
				String taskName = pTask.getTaskname();
				if (taskName == "es regado")
				{
					this.setRiego(true);
				}
				if (taskName == "crece")
				{
					this.Crecer();
				}
				if (taskName == "es fumigado")
				{
					this.Ser_Fumigado();
				}
				if (taskName == "es secado")
				{
					this.setRiego(false);
				}
				if (taskName == "es cortado")
				{
					this.reducirTamano();
				}
				
				pTask.setProcesada(true);
				
				System.out.println(pTask.getTaskOwner()+" "+pTask.getTaskname());
			}
		}
	}
	protected void loadMyTasks() {
	}
}
