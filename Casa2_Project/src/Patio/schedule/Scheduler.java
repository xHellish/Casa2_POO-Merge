package schedule;

import java.util.ArrayList;

import funcionamiento.*;
import gui.GUI;

public class Scheduler {
	
	private ArrayList<Task> tasks;
	private ArrayList<Vegetacion> patio;
	
	public Scheduler() {
		
		patio = new ArrayList<Vegetacion>();
		
		Arbol a1 = new Arbol("Roble", false, 50);
		patio.add(a1);
		
		ScheduleParser parser = new ScheduleParser();
		tasks = parser.getTasks();
	}
	
	public void processTasks(GUI frame) {
		for(Task task: tasks) { 
			for(Vegetacion ePatio: patio) {
				ePatio.process(task);
				frame.decirAccion(task.getTasktime().toString(), task.getTaskname().toString());
			}			
		}
	}
}
