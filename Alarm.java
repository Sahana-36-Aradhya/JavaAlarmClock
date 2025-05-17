package AlarmDemo;

	import java.time.LocalTime;
	import java.time.format.DateTimeFormatter;
	import java.time.format.DateTimeParseException;
	import java.util.Scanner;

	public class Alarm {
		public static void main(String [] args) {
			
			Scanner scanner = new Scanner(System.in);
			LocalTime time = null;
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			
			while(time == null) {
			 try {
				System.out.print("Enter the alarm time: ");
				String alarmTime = scanner.nextLine();
				time = LocalTime.parse(alarmTime, formatter);
				System.out.println("The alarm is set at : " +time);
			 }
			 catch(DateTimeParseException e) {
				System.out.println("Enter the time in the (HH:MM:SS) format..");
			 }
			}
			
			ThreadImplementation threadimplement = new ThreadImplementation(time);
			Thread thread = new Thread(threadimplement);
			thread.start();
			
		}
	}  
