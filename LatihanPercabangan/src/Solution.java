import java.time.LocalDate;
import java.util.Scanner;

//deklarasi class
public class Solution {
    //deklarasi main method
    public static void main(String[] args) {
        //deklarasi variabel
        String nama, jk;
        int tahunLahir, umur;
        double tinggiBadan, beratBadan;
        
        //deklarasi scanner
        Scanner scanner = new Scanner(System.in);
        
        //get tanggal sekarang
        LocalDate currentDate = LocalDate.now();
        //simpan tahun di variabel
        int currentYear = currentDate.getYear();
        
        //baca input nama
        nama = scanner.nextLine();
        
        //baca input tahun lahir
        tahunLahir = scanner.nextInt();
        
        //untuk inputan string selanjutnya agar terbaca
        scanner.nextLine();
        
        //baca input jenis kelamin
        jk = scanner.nextLine();
        
        //baca input tinggi badan
        tinggiBadan = scanner.nextDouble();
        
        //hitung umur
        umur = currentYear-tahunLahir;
        
        //hitung berat badan berdasarkan jenis kelamin
        if(jk.equals("Pria")){
            //hitung berat badan
            beratBadan = tinggiBadan - 100.0 - ((tinggiBadan-100.0)/10.0);
        }else if(jk.equals("Wanita")){
            //hitung berat badan
            beratBadan = tinggiBadan - 100.0 - ((tinggiBadan-104.0)/10.0);
        }else{
            beratBadan = 0.0;
        }
        
        //percabangan untuk cek input jenis kelamin dan tampilkan output
        if(jk.equals("Pria") || jk.equals("Wanita")){
            //output nama
            System.out.println("Nama: "+nama);
            
            //output umur
            System.out.println("Umur: "+umur);
            
            //output jenis kelamin
            System.out.println("Jenis Kelamin: "+jk);
            
            //output berat badan ideal
            System.out.println("Berat Badan Ideal: "+beratBadan+" Kg");
        }else{
            //output jika jenis kelamin invalid
            System.out.println("Input data Jenis Kelamin tidak sesuai.");
        }        
        
        //close scanner
        scanner.close();
    }
}