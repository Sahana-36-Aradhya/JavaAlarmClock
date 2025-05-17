# ⏰ Java Alarm Clock

A simple console-based alarm clock built using Java. The application lets you set an alarm time in `HH:mm:ss` format, displays the current system time updating every second on the same line, and plays a beep sound when the alarm time is reached. You can stop the alarm by pressing *Enter*.

## 📌 Features

- Set an alarm using `HH:mm:ss` format
- Displays live time every second on the same line
- Plays a `.wav` file as an alarm when time is up
- User can stop the alarm manually

## 🛠️ Technologies Used

- Java 11+
- Java Time API (`LocalTime`)
- Java Sound API (`javax.sound.sampled`)
- Threading
- File handling for playing sound

## 🚀 How to Run

1. Clone or download the repository.
2. Ensure `beep.wav` sound file is placed at:  
   `src/AlarmDemo/beep.wav`
3. Compile and run the project using your IDE or terminal:

   **Using Terminal:**
   javac src/AlarmDemo/*.java
   java -cp src AlarmDemo.Alarm
4. When prompted, enter time in HH:mm:ss format (e.g., 15:30:00 for 3:30 PM).
5. Wait for the system time to match the alarm time.
6. A beep sound will play when the time is reached.
7. Press Enter to COMPLETED the alarm.

### ✅ What to do next:
- Save this content as `README.md` in your project root folder.
- Push to GitHub using your usual flow:
  git add README.md
  git commit -m "Add project README"
  git push
