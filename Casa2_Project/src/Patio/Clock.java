package Patio;

import java.util.Calendar;
import java.util.Date;

public class Clock extends Thread {
	private static boolean running = true;
	private static Date currentTime;
	private Scheduler scheduler;
	private GUI frame;
	
	public Clock(Scheduler pScheduler, GUI pframe) {
		scheduler = pScheduler;
		frame = pframe;
	}
	
	public void stopTimer() {
		running = false;
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		currentTime = Calendar.getInstance().getTime();
		currentTime.setDate(29); currentTime.setMonth(7);
		currentTime.setHours(0);
		currentTime.setMinutes(0); currentTime.setSeconds(0);
		while (running) {
			try {
				currentTime.setHours(currentTime.getHours()+1);
				currentTime.setMinutes(0); currentTime.setSeconds(0);
				frame.decirAccion("Hora actual: ", currentTime.toString());
				scheduler.processTasks(frame, currentTime);
				Thread.sleep(5000);	// controlar la escala de tiempo
				if (currentTime.getHours()==0)
				{
					stopTimer();
				}
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
		}
	}
	
	public static int getSecondsToNow(Date pBaseTime) {
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(pBaseTime);
        
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        
        // total seconds
        return (hours * 3600) + (minutes * 60) + seconds;		
	}
	
	public static Date getTime() {
		return Calendar.getInstance().getTime();
	}
}
