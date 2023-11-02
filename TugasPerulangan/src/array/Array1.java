package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = {{1,2,3,4},{5,6,7,8},{2,4,6,8}};

        // arr[2][3] = 100;
        
        // int[][] arr = new int[2][2];
        // arr[2][2] = 10;

        // System.out.println(Arrays.deepToString(arr));

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) 
        //     arr[i][j] = scanner.nextInt();\
        // }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) 
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }

        scanner.close();
    }
}
