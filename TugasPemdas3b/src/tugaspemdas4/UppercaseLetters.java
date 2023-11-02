package tugaspemdas4;

import java.util.Scanner;

public class UppercaseLetters {
    public static void main(String[] args) {
        System.out.println("Count uppercase letters");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Text : ");
        String inputString = scanner.nextLine();
        
        String[] parts = inputString.split("");
        
        int uppercase = 0;
        
        for(int i = 0; i < parts.length; i++){
            char letters = parts[i].charAt(0);
            if(Character.isUpperCase(letters)){
                uppercase++;
            }
        }
        
        System.out.println("The number of uppercase letters is "+uppercase);
        
        scanner.close();
    }
}
