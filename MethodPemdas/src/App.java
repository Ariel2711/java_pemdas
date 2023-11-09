// import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // tes();
        // System.out.println(Arrays.toString(intArr(5)));
        Scanner scanner = new Scanner(System.in);
        int bil = scanner.nextInt();
        int faktorial = faktorial(bil);
        System.out.println("Faktorial dari "+bil+" adalah "+faktorial);
        scanner.close();
    }

    public static int faktorial(int bil){
        if(bil == 1)
            return 1;
        else
            return (bil * faktorial(bil-1));
    } 

    public static int[] intArr(int panjang){
        int [] arr = new int [panjang];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) 
            arr[i] = scanner.nextInt();
        scanner.close();        
        return arr;
    }

    public static void tes(){
        System.out.println("tes");
        return;
    }
}