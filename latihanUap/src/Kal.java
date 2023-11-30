import java.util.Arrays;
import java.util.Scanner;

public class Kal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int panjang = scanner.nextInt();
        int[] nilai = new int[panjang];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = scanner.nextInt();
        }
        
        Arrays.sort(nilai);

        int maxCount = 0;
        double modus = -1.0;

        for (int i = 0; i < nilai.length; i++) {
            int count = 0;
            for (int j = 0; j < nilai.length; ++j) {
                if (nilai[j] == nilai[i]) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                modus = nilai[i];
            } else if (count == maxCount && nilai[i] > modus) {
                modus = nilai[i];
            }
        }

        
        double median = 0.0;
        if (nilai.length % 2 == 0) {
            median = (nilai[(nilai.length / 2) - 1] + nilai[nilai.length / 2]) / 2.0;
        } else {
            median = nilai[nilai.length / 2];
        }

        int nilaiMax = nilai[nilai.length - 1];
        for (int i = 0; i < nilai.length - 1; i++) {
            if(nilai[i] == nilai[nilai.length - 1]){
                nilaiMax += nilai[i];
            }
        }

        System.out.println("Total Nilai Terbesar = " + nilaiMax);
        System.out.println("Median = " + median);
        System.out.println("Modus = " + modus);

        scanner.close();
    }
}
