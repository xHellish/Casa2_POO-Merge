package funcionamiento;
import java.util.ArrayList;

import control.Util;
import schedule.Task;
import timer.Clock;

public class Vegetacion {
	public ArrayList<String> tasks;
	protected int tamano;
	protected boolean plaga=false;
	protected boolean riego=false;
	protected boolean fumigado=false;
	
	
	//Funciones
	public Vegetacion(int pSize) {
		tasks = new ArrayList<String>();
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
	public boolean isPlaga() {
		return plaga;
	}
	public void setPlaga(boolean pPlaga) {
		plaga = pPlaga;
	}
	public boolean isRiego() {
		return riego;
	}
	public boolean isFumigado() {
		return fumigado;
	}
	
	public void process(Task pTask) {
		for(String task : tasks) {
			
			if (
				task.compareTo(pTask.getTaskname())==0 &&
				!pTask.isProcesada() //&&
				//Clock.getSecondsToNow(pTask.getTasktime())<=
				//Clock.getSecondsToNow(Clock.getTime())
				) 
			{
				
				pTask.setProcesada(true);
				
				System.out.println(this.getClass().toString()+" "+pTask.getTaskname());
			}
		}
	}
	protected void loadMyTasks() {
	}
}
