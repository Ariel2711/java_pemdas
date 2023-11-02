package TugasPemdas1;
import java.util.Scanner;

//deklarasi class
public class Soal20 {
    //main method
    public static void main(String[] args) {
        //deklarasi variabel
        double balance, annualInterestRate, interest;
        //deklarasi scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);
        
        //judul program 
        System.out.println("Financial application: calculate interest");
        
        //output perintah untuk input balance
        System.out.print("Input balance : ");
        //baca input balance
        balance = scanner.nextDouble();
        
        //output perintah untuk input interest rate
        System.out.print("Input interest rate : ");
        //baca input annual interest rate
        annualInterestRate = scanner.nextDouble();
        
        //hitung interest dengan rumus
        interest = balance * (annualInterestRate/1200);
        //output nilai interest
        System.out.println("The interest is : "+interest);
        
        //close scanner
        scanner.close();
    }
}
