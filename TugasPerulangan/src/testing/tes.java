package testing;

import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        // double angka = 10_000_000;
        // System.out.printf("Rp %,.2f", angka);
        // String nama = "Ariel Naviandana Putra 27 11";
        // System.out.println(nama.substring(0, 3));
        // for (int i = 0; i < nama.length(); i++) {
            
        // }
        // String[] list = nama.split(" ");
        // System.out.println(list.length);
        // int totalString = 0;
        // for (int i = 0; i < nama.length(); i++) {
        //     if(nama.substring(i, (i+1)).equals(" ")){
        //         totalString++;
        //     }
        // }
        // System.out.println(nama.length() > 0 ? totalString+1 : totalString);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input NIM : ");
        String nim = scanner.nextLine();

        String angkatan = nim.substring(0, 2);
        System.out.println("Angkatan : 20"+angkatan);

        String fakultas = nim.substring(2, 6);
        System.out.print("Fakultas : ");
        if(fakultas.equals("5150"))System.out.println("Ilmu Komputer");

        String prodi = nim.substring(6, 8);
        System.out.print("Prodi : ");
        if(prodi.equals("20"))System.out.println("Teknik Informatika");
        else if(prodi.equals("30"))System.out.println("Teknik Komputer");
        else if(prodi.equals("40"))System.out.println("Sistem Informasi");
        else if(prodi.equals("60"))System.out.println("Pendidikan Teknologi Informasi");
        else if(prodi.equals("70"))System.out.println("Teknologi Informasi");

        String jalur = nim.substring(8, 12);
        System.out.print("Jalur Masuk : ");
        if(jalur.equals("0111"))System.out.println("SNBT");
        else if(jalur.equals("1111"))System.out.println("SNBP");
        else if(jalur.equals("7111"))System.out.println("Mandiri");

        String noUrut = nim.substring(12, 15);
        System.out.println("Nomor Urut : "+noUrut);
        scanner.close();
    }
}
