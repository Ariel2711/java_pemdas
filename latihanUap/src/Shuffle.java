import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kartu = scanner.nextLine();
        int acak = scanner.nextInt();

        if (kartu.length() % 2 == 0)
            for (int i = 0; i < acak; i++)
                kartu = acakGenap(kartu, kartu.length() / 2);   
        else if (kartu.length() % 2 != 0)
            for (int i = 0; i < acak; i++)
                kartu = acakGanjil(kartu, kartu.length() / 2);

        System.out.println(kartu);
            
        scanner.close();
    }

    public static String acakGenap(String kartuAwal, int batas) {
        String bagPertama = kartuAwal.substring(0, batas);
        String bagKedua = kartuAwal.substring(batas);
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < batas; i++) {
            hasil.append(bagPertama.charAt(i));
            hasil.append(bagKedua.charAt(i));
        }

        return hasil.toString();
    }

    public static String acakGanjil(String kartuAwal, int batas) {
        String bagAwal = kartuAwal.substring(0, batas + 1);
        String bagAkhir = kartuAwal.substring(batas + 1);
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < batas; i++) {
            hasil.append(bagAwal.charAt(i));
            if(i != batas) hasil.append(bagAkhir.charAt(i));
            if(i == batas - 1) hasil.append(bagAwal.charAt(i+1));
        }

        return hasil.toString();
    }
}