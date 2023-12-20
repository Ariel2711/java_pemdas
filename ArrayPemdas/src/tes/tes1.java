package tes;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];

        int[][] matrix2 = new int[2][2];

        System.out.println("Input matrix pertama : ");

        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                matrix1[i][j] = scanner.nextInt();

        System.out.println("Input matrix kedua : ");

        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                matrix2[i][j] = scanner.nextInt();

        if (vertikal(matrix1, matrix2)) 
            System.out.println("vertikal cocok");
        else if (horizontal(matrix1, matrix2)) 
            System.out.println("horizontal cocok");
        else 
            System.out.println("tidak cocok");
        
        scanner.close();
    }

    public static boolean vertikal(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                if (matrix1[i][j] != matrix2[i][2 - 1 - j]) 
                    return false;
        return true;
    }

    public static boolean horizontal(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                if (matrix1[i][j] != matrix2[2 - 1 - i][j]) 
                    return false;  
        return true;
    }
}