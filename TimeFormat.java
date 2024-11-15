// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String amPm = "AM";
		
		if (hours < 12) {
			 amPm = "AM"; 
			} else {
			amPm = "PM"; 
			hours = hours - 12; 
			if (hours == 0) {
				 hours = 12; 
				}
		}
		if (hours < 10) { hours = (hours % 10); } // gets rid of the '0' in case the hour is less then 10 
		
		if (minutes < 10) {
			 System.out.println(hours + ":0" + minutes + " " + amPm); 
			} else {
				 System.out.println(hours + ":" + minutes + " " + amPm); 
		}
      
	}
}