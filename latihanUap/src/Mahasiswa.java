import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahMhs = scanner.nextInt();
        int jumlahNilai = scanner.nextInt();
        String [] namaMhs = new String[jumlahMhs];
        int [][] nilai = new int [jumlahMhs][jumlahNilai];
        for (int i = 0; i < jumlahMhs; i++) {
            scanner.nextLine();
            namaMhs[i] = scanner.nextLine();
            for (int j = 0; j < jumlahNilai; j++) {
                nilai[i][j] = scanner.nextInt();
            }
        }

        double [] ratarata = new double[jumlahMhs];
        for (int i = 0; i < jumlahMhs; i++) {
            double nilaiAkhir = 0.0;
            for (int j = 0; j < jumlahNilai; j++) {
                nilaiAkhir += nilai[i][j];
            }
            nilaiAkhir /= jumlahNilai;
            ratarata[i] = nilaiAkhir;
        }

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Rata-rata nilai mahasiswa "+ namaMhs[i] +" adalah "+ ratarata[i]);
        }

        double ratarataKelas = 0.0;
        double maxNilai = 0.0;
        int maxIndex = 0;
        for (int i = 0; i < ratarata.length; i++) {
            ratarataKelas += ratarata[i];
            if(ratarata[i] > maxNilai){
                maxNilai = ratarata[i];
                maxIndex = i;
            }
        }

        ratarataKelas /= ratarata.length;

        System.out.println("Rata-rata kelas: "+ ratarataKelas);

        System.out.println("Mahasiswa yang memiliki nilai tertinggi adalah "+ namaMhs[maxIndex] +" dengan nilai "+ ratarata[maxIndex]);

        scanner.close();
    }
}
