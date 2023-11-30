import java.util.Scanner;

public class tes{
    public static void main(String[] args) {
        Scanner yb = new Scanner(System.in);

        int jumlahMahasiswa = yb.nextInt();

        int banyakNilai = yb.nextInt();

        yb.nextLine();

        String namaMahasiswa = yb.nextLine();

        double totalNilai = 0;
        double nilaiTertinggi = 0;

        for (int i = 0; i < banyakNilai; i++) {
            double nilai = yb.nextDouble();
            totalNilai += nilai;

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
        }

        double rataRataMahasiswa = totalNilai / banyakNilai;

        System.out.println("Rata-rata nilai mahasiswa " + namaMahasiswa + " adalah " + rataRataMahasiswa);

        double rataRataKelas = totalNilai / (jumlahMahasiswa * banyakNilai);
        System.out.println("Rata-rata kelas: " + rataRataKelas);

        System.out.println("Mahasiswa yang memiliki nilai tertinggi adalah " + namaMahasiswa + " dengan nilai " + nilaiTertinggi);

        yb.close();
    }
}