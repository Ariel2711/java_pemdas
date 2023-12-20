import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row1 = scanner.nextInt();
        int column1 = scanner.nextInt();

        int[][] matrix1 = new int[row1][column1];

        for (int i = 0; i < row1; i++) 
            for (int j = 0; j < column1; j++) 
                matrix1[i][j] = scanner.nextInt();

        int row2 = scanner.nextInt();
        int column2 = scanner.nextInt();

        int[][] matrix2 = new int[row2][column2];

        for (int i = 0; i < row2; i++) 
            for (int j = 0; j < column2; j++) 
                matrix2[i][j] = scanner.nextInt();

       if (row1 != row2 || column1 != column2) 
            System.out.println("tidak identik");
        else if (identik(matrix1, matrix2, row1))
            System.out.println("identik");
        else if (refleksiVertikal(matrix1, matrix2, row1)) 
            System.out.println("vertikal");
        else if (refleksiHorizontal(matrix1, matrix2, row1)) 
            System.out.println("horizontal");
        else if (refleksiDiagonalKanan(matrix1, matrix2, row1)) 
            System.out.println("diagonal kanan bawah");
        else if (refleksiDiagonalKiri(matrix1, matrix2, row1)) 
            System.out.println("diagonal kiri bawah");
        else 
            System.out.println("tidak identik");
        
        scanner.close();
    }

    public static boolean identik(int[][] matrix1, int[][] matrix2, int row1) {
        for (int i = 0; i < row1; i++) 
            for (int j = 0; j < row1; j++) 
                if (matrix1[i][j] != matrix2[i][j]) 
                    return false;
        return true;
    }

    public static boolean refleksiVertikal(int[][] matrix1, int[][] matrix2, int row1) {
        for (int i = 0; i < row1; i++) 
            for (int j = 0; j < row1; j++) 
                if (matrix1[i][j] != matrix2[i][row1 - 1 - j]) 
                    return false;
        return true;
    }

    public static boolean refleksiHorizontal(int[][] matrix1, int[][] matrix2, int row1) {
        for (int i = 0; i < row1; i++) 
            for (int j = 0; j < row1; j++) 
                if (matrix1[i][j] != matrix2[row1 - 1 - i][j]) 
                    return false;  
        return true;
    }

    public static boolean refleksiDiagonalKanan(int[][] matrix1, int[][] matrix2, int row1) {
        for (int i = 0; i < row1; i++) 
            for (int j = 0; j < row1; j++) 
                if (matrix1[i][j] != matrix2[j][i]) 
                    return false;
        return true;
    }

    public static boolean refleksiDiagonalKiri(int[][] matrix1, int[][] matrix2, int row1) {
        for (int i = 0; i < row1; i++) 
            for (int j = 0; j < row1; j++) 
                if (matrix1[i][j] != matrix2[row1 - 1 - j][row1 - 1 - i]) 
                    return false;
        return true;
    }
}