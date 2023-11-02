package TugasPemdas2;

import java.util.Scanner;

public class WindTemperature {
    public static void main(String[] args) {
        System.out.println("Science: wind-chill temperature");
        
        double temperature, windSpeed;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit between -58 F and 41 F : ");
        temperature = scanner.nextDouble();
        
        System.out.print("Enter the wind speed (>=2) in miles per hour : ");
        windSpeed = scanner.nextDouble();
      
        if(temperature < -58 || temperature > 41 || windSpeed < 2){
            System.out.println("Your input for temperature or wind speed is invalid!");
            System.out.println("The temperature should be between -58 F and 41 F");
            System.out.println("The wind speed should be (>=) 2");
        }else{
            double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
            System.out.println("The wind chill index is "+windChill);
        }
        
        scanner.close();
    }
}