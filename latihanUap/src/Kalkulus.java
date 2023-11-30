import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Kalkulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int panjang = scanner.nextInt();
        int[] nilai = new int[panjang];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = scanner.nextInt();
        }
        
        Arrays.sort(nilai);

        System.out.println("Total Nilai Terbesar = " + nilai[nilai.length - 1]);
        double total = 0.0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double median = 0.0;
        if(nilai.length % 2 == 0){
            median = (nilai[nilai.length / 2] + nilai[(nilai.length - 1)]) / 2;
        }else{
            median = nilai[(nilai.length/2) - 1];
        }
        // DecimalFormat dFormat = new DecimalFormat("#.##");
        // String formatedMedian = dFormat.format(median);
        System.out.println("Median = "+median);
        // double modus = total / nilai.length;
        // String formatedModus = dFormat.format(modus);
        // System.out.println("Modus = "+formatedModus);

        int maxCount = 0;
        double modus = -1.0;

        for (int i = 0; i < nilai.length; ++i) {
            int count = 0;
            for (int j = 0; j < nilai.length; ++j) {
                if (nilai[j] == nilai[i]) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                modus = nilai[i];
            }
        }

        if (maxCount > 1) {
            // String formatedModus = dFormat.format(modus);
            System.out.println("Modus = " + modus);
        } else {
            System.out.println("Modus = "+nilai[nilai.length - 1]);
        }


        scanner.close();
    }
}
