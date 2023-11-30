import java.util.Scanner;

public class ShuffleCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kartu = scanner.nextLine();
        int acak = scanner.nextInt();

        if (kartu.length() % 2 == 0)
            for (int i = 0; i < acak; i++) 
                kartu = acakGenap(kartu);
        else
            for (int i = 0; i < acak; i++) 
                kartu = acakGanjil(kartu);

        System.out.println(kartu);

        scanner.close();
    }

    public static String acakGenap(String kartu) {
        int panjang = kartu.length();
        int batas = panjang / 2;
        String bagianPertama = kartu.substring(0, batas);
        String bagianKedua = kartu.substring(batas);
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < batas; i++) {
            hasil.append(bagianPertama.charAt(i));
            hasil.append(bagianKedua.charAt(i));
        }
        return hasil.toString();
    }

    public static String acakGanjil(String kartu) {
        int panjang = kartu.length();
        int batas = (panjang / 2) + 1;

        String bagianPertama = kartu.substring(0, batas);
        String bagianKedua = kartu.substring(batas);
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < batas; i++) {
            hasil.append(bagianPertama.charAt(i));
            if(i != batas) hasil.append(bagianKedua.charAt(i));
            if(i == batas - 1) hasil.append(bagianPertama.charAt(i+1));
        }
        return hasil.toString();
    }
}