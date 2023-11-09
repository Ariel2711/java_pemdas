import java.util.Scanner;

public class Fibonacci {
    static int angkaSekarang = 0, angkaSebelumnya = 0, iterasi = 0, panjangBarisan;
     public static void main(String[] args) {
        if(iterasi == 0){
            System.out.println("Barisan Fibonacci");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input angka pertama\t : ");
            Fibonacci.angkaSekarang = scanner.nextInt();

            System.out.print("Input panjang barisan\t : ");
            Fibonacci.panjangBarisan = scanner.nextInt();

            scanner.close();
        }

        if (iterasi < panjangBarisan) {
            System.out.print(angkaSekarang + ", ");

            int temp = angkaSekarang;
            angkaSekarang += angkaSebelumnya;
            angkaSebelumnya = temp;

            iterasi++;
            main(args);
        }
    }
}