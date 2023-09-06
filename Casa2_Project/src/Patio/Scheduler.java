package Patio;

import java.util.ArrayList;
import java.util.Date;


public class Scheduler {
	
	private ArrayList<Task> tasks;
	private ArrayList<Vegetacion> patio;
	
	public Scheduler(ArrayList<Vegetacion> pPatio) {
		
		patio = pPatio;
		
		ScheduleParser parser = new ScheduleParser();
		tasks = parser.getTasks();
	}
	
	public void processTasks(GUI frame, Date currentTime) {
		for(Task task: tasks) { 
			
			Date taskDate = task.getTasktime();
			if (currentTime.getYear()==taskDate.getYear() && currentTime.getMonth()==taskDate.getMonth() && currentTime.getDate()==taskDate.getDate() && currentTime.getHours()==taskDate.getHours() && currentTime.getMinutes()==taskDate.getMinutes()) {
				for(Vegetacion ePatio: patio) {
					 if (ePatio.nombre.equals(task.getTaskOwner())) {
						 ePatio.process(task);
						 frame.decirAccion(task.getTaskOwner(), task.getTaskname().toString());
					 }
					 
				}			
			}
		}
	}
}
