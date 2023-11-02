import java.util.Scanner;

public class Utp2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner =  new Scanner(System.in);

        int teori, parktik, kerjasama;
        double angkaMutu = 0;
        String hurufMutu = "", predikat = "";

        teori = scanner.nextInt();
        parktik= scanner.nextInt();
        kerjasama = scanner.nextInt();

        double hasilAkhir = (teori * 0.4) + (parktik * 0.4) + (kerjasama * 0.2);
        if(hasilAkhir > 80 && hasilAkhir <= 100){
            hurufMutu = "A";
            angkaMutu = 4.0;
            predikat = "Sangat Baik";
        }else if(hasilAkhir >75 && hasilAkhir <= 80){
            hurufMutu = "B+";
            angkaMutu = 3.5;
            predikat = "Lebih Baik";
        }else if(hasilAkhir >69 && hasilAkhir <= 75){
            hurufMutu = "B";
            angkaMutu = 3.0;
            predikat = "Baik";
        }else if(hasilAkhir >60 && hasilAkhir <= 69){
            hurufMutu = "C+";
            angkaMutu = 2.5;
            predikat = "Lebih dari Cukup";
        }else if(hasilAkhir >55 && hasilAkhir <= 60){
            hurufMutu = "C";
            angkaMutu = 2.0;
            predikat = "Cukup";
        }else if(hasilAkhir >50 && hasilAkhir <= 55){
            hurufMutu = "D+";
            angkaMutu = 1.5;
            predikat = "Lebih dari Kurang";
        }else if(hasilAkhir >44 && hasilAkhir <= 50){
            hurufMutu = "D";
            angkaMutu = 1.0;
            predikat = "Kurang";
        }else if(hasilAkhir >0 && hasilAkhir <= 44){
            hurufMutu = "E";
            angkaMutu = 0.0;
            predikat = "Gagal";
        }

        System.out.println(hurufMutu+" | "+angkaMutu+" | "+predikat);

        scanner.close();
    }
}
