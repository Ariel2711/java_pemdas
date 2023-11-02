package testing;

import java.util.Scanner;

public class tes3 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        
        System.out.print("Masukan angka: ");
        int angka = x.nextInt();
        
        pola(angka); 
        
        x.close();
    
    }
    
    public static void pola (int n){

        for (int a = 1; a <= n; a++){
            for (int b = a; b <= n; b++){
                System.out.print("  ");
            }
            for (int c = 1; c <= a; c++){
                System.out.print(" "+(a+1-c));
            }
            System.out.println();
        }
        
        // for (int a = 1; a <= n; a++) {
        //     for (int s = 1; s <= n - a; s++) {
        //         System.out.print(" ");
        //     }
        //     for (int b = 1; b <= a; b++) {
        //         System.out.print(b);
        //     }
        //     System.out.println();
        // }
        
        // for (int i = n - 1; i >= 1; i--) {
        //     for (int s = 1; s <= n - i; s++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
             
    }
}