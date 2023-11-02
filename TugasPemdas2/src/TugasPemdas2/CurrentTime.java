package TugasPemdas2;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        System.out.println("Current Time");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the time zone offset to GMT : ");
        long timeZoneOffset = scanner.nextLong();
        
        long totalMilliseconds = System.currentTimeMillis()+(timeZoneOffset * 3600000);
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        
        String amPm;
        if (currentHour < 12) {
            amPm = "AM";
        } else {
            amPm = "PM";
        }
        
        if (currentHour > 12) {
            currentHour -= 12;
        }
        
        System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" "+amPm);
        
        scanner.close();
    }
}