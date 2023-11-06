import java.util.Scanner;

// Nama : Nofa Nisrina Salsabila
// NIM : 235150700111005
// Prodi : Teknologi Informasi (A)

//Program Menentukan Pasangan Angka dari Array 2D

public class Tes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Mengambil input ukuran array 2D (width x height)
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        // Mengambil input target
        int target = scanner.nextInt();

        int[][] array = new int[height][width];

        // Kondisi Constraints
        if ((height <= 100 && height >= 1) && (width <= 100 & width >= 1) ) {
            if ((target >= -1000000) && (target <= 1000000) ){
                    
                    // Membaca elemen-elemen array 2D
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            array[i][j] = scanner.nextInt();
                        }
                    }

                    // Melakukan perulangan untuk menemukan operasi yang sesuai target
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            for (int x = i; x < height; x++) {
                                for (int y = j; y < width; y++) {

                                    //Kondisi agar tidak ada operasi yang berulang
                                    if (i != x || j != y) {
                                    int a = array[i][j];
                                    int b = array[x][y];

                                        //Membuat kondisi untuk menambah jumlah dalam variabel "found" dan mengeleuarkan output-nya
                                        if ((a <= 100 && a>= -100) && (b <= 100 && b>= -100)) {

                                            if (a * b == target) {
                                                System.out.println("[" + i + "," + j + "] * [" + x + "," + y + "]");
                                            }
                                            if (b != 0 && a % b == 0 && a / b == target) {
                                                System.out.println("[" + i + "," + j + "] / [" + x + "," + y + "]");
                                            }
                                            if (a != 0 && b % a == 0 && b / a == target) {
                                                System.out.println("[" + x + "," + y + "] / [" + i + "," + j + "]");
                                            }
                                             if (a + b == target) {
                                                System.out.println("[" + i + "," + j + "] + [" + x + "," + y + "]");
                                            }
                                            if (a - b == target) {
                                                System.out.println("[" + i + "," + j + "] - [" + x + "," + y + "]");
                                            }  
                                            if (b - a == target) {
                                                System.out.println("[" + x + "," + y + "] - [" + i + "," + j + "]");
                                            }
                                         
                                        }

                                    }
                
                                }
                            }
                        }
                    }

            scanner.close();

            }

        //If Selesai
        }  


    //Program Selesai
    }
}