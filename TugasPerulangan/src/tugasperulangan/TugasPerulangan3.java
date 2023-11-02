package tugasperulangan;

import java.util.Scanner;

public class TugasPerulangan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isTrue = true;
        
        while(isTrue){
            System.out.println("MENU :");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");
            int menu = scanner.nextInt();
            System.out.println("");
            
            if(menu == 0){
                isTrue = false;
            }else if(menu == 1){
                System.out.println("Hitung Volume Balok");
                System.out.print("Masukkan Panjang : ");
                double pBalok = scanner.nextDouble();
                System.out.print("Masukkan Lebar : ");
                double lBalok = scanner.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tBalok = scanner.nextDouble();
                double vBalok = pBalok * lBalok * tBalok;
                System.out.println("Volume Balok : "+vBalok);
                System.out.println("");
            }else if(menu == 2){
                System.out.println("Hitung Volume Bola");
                System.out.print("Masukkan Radius : ");
                double radiusBola = scanner.nextDouble();
                double vBola = (4.0 / 3.0) * Math.PI * Math.pow(radiusBola, 3);
                System.out.println("Volume Bola : "+vBola);
                System.out.println("");
            }else if(menu == 3){
                System.out.println("Hitung Volume Kerucut");
                System.out.print("Masukkan Jari-Jari : ");
                double radiusKerucut = scanner.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tKerucut = scanner.nextDouble();
                double vKerucut = (1.0 / 3.0) * Math.PI * Math.pow(radiusKerucut, 2) * tKerucut;
                System.out.println("Volume Kerucut : "+vKerucut);
                System.out.println("");
            }else if(menu == 4){
                System.out.println("Hitung Volume Silinder");
                System.out.print("Masukkan Jari-Jari : ");
                double radiusSilinder = scanner.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tSilinder = scanner.nextDouble();
                double vSilinder = Math.PI * Math.pow(radiusSilinder, 2) * tSilinder;
                System.out.println("Volume Silinder : "+vSilinder);
                System.out.println("");
            }else if(menu == 5){
                System.out.println("Hitung Volume Limas Segitiga");
                System.out.print("Masukkan Panjang Alas : ");
                double pAlas = scanner.nextDouble();
                System.out.print("Masukkan Lebar Alas : ");
                double lAlas = scanner.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tSegitiga = scanner.nextDouble();
                double luasAlas = 0.5 * pAlas * lAlas;
                double vLimasSegitigas = (1.0 / 3.0) * luasAlas * tSegitiga;
                System.out.println("Volume Limas Segitiga : "+vLimasSegitigas);
                System.out.println("");
            }else{
                System.out.println("Input tidak valid");
                System.out.println("");
            }
        }
        
        scanner.close();
    }
}