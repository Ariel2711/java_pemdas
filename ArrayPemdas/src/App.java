import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthRow, lengthColumn, cariAngka;
        lengthRow = scanner.nextInt();
        lengthColumn = scanner.nextInt();
        cariAngka = scanner.nextInt();

        int [][] a = new int[lengthRow][lengthColumn];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int i2 = 0; i2 < a.length; i2++) {
                    for (int j2 = 0; j2 < a[i2].length; j2++) {
                        int hasilTambah = a[i][j] + a[i2][j2];
                        if (i < i2 || (i == i2 && j < j2)) 
                            if (hasilTambah == cariAngka) 
                                System.out.println("[" + i + "," + j + "] + [" + i2 + "," + j2 + "]");
                        int hasilKurang = a[i][j] - a[i2][j2];
                            if (hasilKurang == cariAngka) 
                                System.out.println("[" + i + "," + j + "] - [" + i2 + "," + j2 + "]");
                        int hasilKali = a[i][j] * a[i2][j2];
                        if (i < i2 || (i == i2 && j < j2)) 
                            if (hasilKali == cariAngka) 
                                System.out.println("[" + i + "," + j + "] * [" + i2 + "," + j2 + "]");
                        int hasilBagi = a[i][j] / a[i2][j2];
                            if (hasilBagi == cariAngka) 
                                System.out.println("[" + i + "," + j + "] / [" + i2 + "," + j2 + "]");
                    }
                    
                }
            }
        }

        scanner.close();
    }
}