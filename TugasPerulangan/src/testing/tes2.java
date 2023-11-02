package testing;

import java.util.Scanner;

public class tes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100);
        System.out.println("Angka : "+randomNumber);
        int tebakkan = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Masukkan angka tebakkan : ");
             tebakkan = scanner.nextInt();
            if(tebakkan == randomNumber){
                System.out.println("Tebakkan anda benar!");
                break;
            }else if(tebakkan > randomNumber){
                System.out.println("Terlalu tinggi");
            }else if(tebakkan < randomNumber){
                System.out.println("Terlalu rendah");
            }
            if(i == 4)
                System.out.println("Kesempatan habis!");
            
        }
        scanner.close();
    }   
}
