import java.util.Scanner;

public class Fibonacci {
    static int currNumber, preNumber, lengthFibonacci, iteration = 1;
     public static void main(String[] args) {
        if(Fibonacci.iteration == 1){
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan panjang fibonacci\t : ");
            Fibonacci.lengthFibonacci = scanner.nextInt();

            System.out.print("Masukkan bilangan pertama\t : ");
            Fibonacci.preNumber = scanner.nextInt();

            System.out.print("Masukkan bilangan kedua\t\t : ");
            Fibonacci.currNumber = scanner.nextInt();

            System.out.println("Deret Fibonacci\t\t\t : ");

            scanner.close();
        }

        if (Fibonacci.iteration < Fibonacci.lengthFibonacci) {
            if(Fibonacci.iteration == 1)
                System.out.print(Fibonacci.preNumber + " ");

            System.out.print(Fibonacci.currNumber + " ");   

            int temp = Fibonacci.currNumber;
            Fibonacci.currNumber += Fibonacci.preNumber;
            Fibonacci.preNumber = temp;

            Fibonacci.iteration++;

            main(args);
        }
    }
}