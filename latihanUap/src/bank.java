
import java.util.Scanner;

public class bank {

    private static double saldo = 1000; // Saldo awal

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memilih bahasa
        System.out.println("Pilih bahasa:");
        System.out.println("1. Bahasa Inggris");
        System.out.println("2. Bahasa Indonesia");
        System.out.print("Masukkan nomor bahasa (1/2): ");

        int bahasa = scanner.nextInt();
        String pesanSelamatDatang = (bahasa == 1) ? "Welcome to Simple ATM!" : "Selamat Datang di ATM Sederhana!";

        System.out.println(pesanSelamatDatang);

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Uang");
            System.out.println("3. Setor Uang");
            System.out.println("4. Tukar Mata Uang");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5): ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    tarikUang();
                    break;
                case 3:
                    setorUang();
                    break;
                case 4:
                    tukarMataUang();
                    break;
                case 5:
                    System.out.println("Terima kasih. Keluar dari ATM.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void cekSaldo() {
        System.out.println("Saldo Anda: $" + saldo);
    }

    private static void tarikUang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang akan ditarik: $");
        double jumlahTarik = scanner.nextDouble();

        if (jumlahTarik > saldo) {
            System.out.println("Saldo tidak mencukupi. Transaksi dibatalkan.");
        } else {
            saldo -= jumlahTarik;
            System.out.println("Penarikan berhasil. Saldo Anda sekarang: $" + saldo);
        }
    }

    private static void setorUang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang akan disetor: $");
        double jumlahSetor = scanner.nextDouble();

        if (jumlahSetor <= 0) {
            System.out.println("Jumlah setoran tidak valid. Transaksi dibatalkan.");
        } else {
            saldo += jumlahSetor;
            System.out.println("Setoran berhasil. Saldo Anda sekarang: $" + saldo);
        }
    }

    private static void tukarMataUang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis pertukaran:");
        System.out.println("1. Rupiah ke USD");
        System.out.println("2. USD ke Rupiah");
        int jenisPertukaran = scanner.nextInt();

        switch (jenisPertukaran) {
            case 1:
                tukarMataUang("Rp", "$", 15000.00); // Kurs dari rupiah ke USD
                break;
            case 2:
                tukarMataUang("$", "Rp", 15000.00); // Kurs dari USD ke rupiah
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    private static void tukarMataUang(String dariMataUang, String keMataUang, double kurs) {
        double jumlahTukar = masukkanJumlahUang(dariMataUang);

        if (jumlahTukar > 0 && saldo >= jumlahTukar) {
            saldo -= jumlahTukar;
            double jumlahDiterima = 0.0;
            if (dariMataUang.equals("Rp")) {
                jumlahDiterima = (jumlahTukar * 1000) / kurs;
            } else if (dariMataUang.equals("$")) {
                jumlahDiterima = jumlahTukar * kurs;
            }
            System.out.println("Pertukaran berhasil. Anda mendapatkan: " + keMataUang + " " + jumlahDiterima);
            System.out.println("Saldo Anda sekarang: $" + saldo);
        } else {
            System.out.println(
                    "Jumlah uang " + dariMataUang + " tidak valid atau saldo tidak mencukupi. Transaksi dibatalkan.");
        }
    }

    private static double masukkanJumlahUang(String mataUang) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang " + mataUang + ": ");
        return scanner.nextDouble();
    }
}