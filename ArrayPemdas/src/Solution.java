import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int target = scanner.nextInt();
    
        int[][] array = new int[height][width];
        for (int i = 0; i < array.length; i++) 
            for (int j = 0; j < array[i].length; j++) 
                array[i][j] = scanner.nextInt();
            
        for (int i = 0; i < array.length; i++) 
            for (int j = 0; j < array[i].length; j++) 
                for (int x = i; x < array.length; x++) 
                    for (int y = 0; y < array[x].length; y++) {
                        if (i == x && y <= j) 
                            continue;

                        int a = array[i][j];
                        int b = array[x][y];

                        if (a + b == target)
                            System.out.println("[" + i + "," + j + "] + [" + x + "," + y + "]");
                        if (a - b == target)
                            System.out.println("[" + i + "," + j + "] - [" + x + "," + y + "]");
                        if (b - a == target)
                            System.out.println("[" + x + "," + y + "] - [" + i + "," + j + "]");
                        if (a * b == target)
                            System.out.println("[" + i + "," + j + "] * [" + x + "," + y + "]");
                        if (b != 0 && a % b == 0 && a / b == target)
                            System.out.println("[" + i + "," + j + "] / [" + x + "," + y + "]");
                        if (a != 0 && b % a == 0 && b / a == target)
                            System.out.println("[" + x + "," + y + "] / [" + i + "," + j + "]");
                    }
                    
        scanner.close();
    }
}