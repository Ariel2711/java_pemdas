package TugasPemdas1;
import java.util.Scanner;

//deklarasi class
public class Soal10 {
    //main method
    public static void main(String[] args) {
        //deklarasi variabel
        double weight, initialTemperature, finalTemperature, energy;
        //deklarasi scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);
        
        //judul program
        System.out.println("Science: calculating energy");
        
        //output perintah untuk input weight
        System.out.print("Input weight of water in kilograms : ");
        //baca input weight
        weight = scanner.nextDouble();
        
        //output perintah untuk input initial temperature
        System.out.print("Input initial temperature of water : ");
        //baca input initial temperature
        initialTemperature = scanner.nextDouble();
        
        //output perintah untuk input final temperature
        System.out.print("Input final temperature of water : ");
        //baca input final temperature
        finalTemperature = scanner.nextDouble();
        
        //hitung energy dengan rumus
        energy = weight * (finalTemperature - initialTemperature) * 4184;
        //output nilai energy
        System.out.println("The energy needed is : "+energy);
        
        //close scanner
        scanner.close();
    }
}
