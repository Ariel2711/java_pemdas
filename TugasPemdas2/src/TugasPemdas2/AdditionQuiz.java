package TugasPemdas2;

import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
       System.out.println("Game: addition quiz");
        
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is "+number1+" + "+number2+" = ");
        int answer = scanner.nextInt();
        
        if(number1+number2 == answer){
            System.out.println("You are correct!");
        }else{
            System.out.println("Your answer is wrong!");
            System.out.println(number1+" + "+number2+" is "+(number1+number2));
        }
        
        scanner.close();
    }
}