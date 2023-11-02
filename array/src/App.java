import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int [] a = new int [] {19,27,13};
        // String [] b = new String[]{"tes", "tes2"};

        // Arrays.sort(a);

        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }
        Scanner scanner = new Scanner(System.in);
        int panjang = 0;
        System.out.print("Masukkan panjang Array : ");
        panjang = scanner.nextInt();
        int[] a = new int[panjang];

        for (int i = 0; i < panjang; i++) {
            System.out.print("Masukkan angka ke-"+(i+1)+" : ");
            a[i] = scanner.nextInt();            
        }

        int angkaTerbesar = 0, angkaTerkecil = 0;
        int[] terkecil = new int[panjang];

        angkaTerkecil = terkecil[0];
        angkaTerbesar = terkecil[panjang-1];

        System.out.println("Angka terbesar : "+angkaTerbesar);
        System.out.println("Angka terkecil : "+angkaTerkecil);

        System.out.println("Urutan angka : "+Arrays.toString(terkecil));


        scanner.close();
    }
}
