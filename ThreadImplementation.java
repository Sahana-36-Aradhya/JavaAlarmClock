package AlarmDemo;
import java.util.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ThreadImplementation implements Runnable{
	
	private final LocalTime alarmtime;
	public ThreadImplementation(LocalTime alarmtime){
		this.alarmtime = alarmtime;
	}
	
	
	@Override
	public void run() {
		
		while(LocalTime.now().isBefore(alarmtime)) {
			LocalTime currentTime = LocalTime.now();
			try {
				Thread.sleep(1000);
				System.out.printf("%02d:%02d:%02d\r",
									currentTime.getHour(),
									currentTime.getMinute(),
									currentTime.getSecond());
			} 
			catch (InterruptedException e) {
				System.out.println("Thread was intrupted...");
			}
		}
		ringingAlarm();
	}
	
	public void ringingAlarm() {
		Scanner sc = new Scanner(System.in);
		String basePath = System.getProperty("user.dir");
		String fullPath = basePath + "/src/AlarmDemo/beep.wav";
		
		File file = new File(fullPath);
		try {
			AudioInputStream audio = AudioSystem.getAudioInputStream(file);
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(audio);
				clip.start();
				System.out.print("\nEnter *COMPLETED* to stop :");
				sc.nextLine();
				clip.stop();
				sc.close();
				
			} catch (LineUnavailableException e) {
				System.out.println("Sorry problem in clip");
			}
		} 
		catch (UnsupportedAudioFileException | IOException e) {
			System.out.println("The exception is " + e);
		}
	}
	
}  
