/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Soal10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double weight, initialTemperature, finalTemperature, result;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program that calculates the energy needed to heat water");
        System.out.print("Input weight of water in kilograms : ");
        weight = scanner.nextDouble();
        System.out.print("Input initial temperature of water : ");
        initialTemperature = scanner.nextDouble();
        System.out.print("Input final temperature of water : ");
        finalTemperature = scanner.nextDouble();
        result = weight * (finalTemperature - initialTemperature) * 4184;
        System.out.println("Result : "+result);
    }
    
}
