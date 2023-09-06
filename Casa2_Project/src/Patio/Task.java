package Patio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
	private Date tasktime;
	private String taskname;
	private String taskOwner;
	private boolean procesada;
	
	public Task(String pTasktime, String pTaskName, String pTaskOwner) {
		this.procesada = false;
		this.taskOwner = pTaskOwner;
		this.taskname = pTaskName;
		
		String dateString = "2023-08-29 "+pTasktime;
        String pattern = "yyyy-MM-dd HH:mm:ss";
        
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            tasktime = dateFormat.parse(dateString);		
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }
	}
	
	public Date getTasktime() {
		return tasktime;
	}
	
	public String getTaskname() {
		return taskname;
	}

	public String getTaskOwner() {
		return taskOwner;
	}
	
	public boolean isProcesada() {
		return procesada;
	}

	public void setProcesada(boolean procesada) {
		this.procesada = procesada;
	}
}
