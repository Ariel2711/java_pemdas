package tugasperulangan;

import java.util.Scanner;

public class TugasPerulangan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = scanner.nextInt();
        
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= n; j++){
                if(j >= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        scanner.close();
    }
}