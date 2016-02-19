package se.mah.ke.k3lara;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockLogic {
	
	private int alarmHour;
	private int alarmMinute;
	private DigitalClockGUI clockGui;
	private ClockLogic clockThread;
	
	
	
	
	public ClockLogic(DigitalClockGUI clockGui){
		this.clockGui = clockGui;

		new ClockThread().start();; 
	}
	public void setAlarm(int alarmHour, int alarmMinute){
		this.alarmHour = alarmHour;
		this.alarmMinute = alarmMinute;
		
		
		
		if((alarmHour >= 0) && (alarmHour < 24) ){
			this.alarmHour = alarmHour;
		} else {
			alarmHour = -1;
			clockGui.setAlarmTimeOnLabel("Wrong alarm input!");
		}

		// Make sure the minute value is within range, otherwise set it to -1 to disable alarm.
		if((alarmMinute >= 0) && (alarmMinute < 60) ){
			this.alarmMinute = alarmMinute;
		} else {
			alarmMinute = -1;
			clockGui.setAlarmTimeOnLabel("Wrong alarm input!");
		}
		
		if((alarmHour >= 0) && (alarmMinute >= 0))
		{
			// Create a decimal format object for formatting the time string.
			DecimalFormat decimalFormat = new DecimalFormat("00");

			clockGui.setAlarmTimeOnLabel(decimalFormat.format(alarmHour) + ":" + decimalFormat.format(alarmMinute));
		}
		else
		{
			clockGui.setAlarmTimeOnLabel("Wrong alarm input!");
		}
		
		
	}
	public void clearAlarm(){
		
		clockGui.setAlarmTimeOnLabel("No alarm is set.");
		clockGui.activateAlarm(false);
	}



	private class ClockThread extends Thread{
		@Override
		public void run(){
			DecimalFormat decimalFormat = new DecimalFormat("00");
			while(true){
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR_OF_DAY);
				int minute = c.get(Calendar.MINUTE);
				int sec = c.get(Calendar.SECOND);
				
				clockGui.setTimeOnLabel("" +decimalFormat.format(hour) + ":" + decimalFormat.format(minute) + ":" + decimalFormat.format(sec));
				
				
				if((hour == alarmHour) && (minute == alarmMinute)) {
					clockGui.activateAlarm(true);
				} else {
					clockGui.activateAlarm(false);
					
					
				}
				try {
					Thread.sleep(900);
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;
				}
				
			}
		}
	}

}
