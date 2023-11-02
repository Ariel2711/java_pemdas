package tugaspemdas4;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        System.out.println("Financial Application: compound vslue");
        
        Scanner scanner = new Scanner(System.in);
        double amount, annualInterestRate;
        int month;
        
        System.out.print("Input amount : ");
        amount = scanner.nextDouble();
        
        System.out.print("Input annual interest rate : ");
        annualInterestRate = scanner.nextDouble();
        
        System.out.print("Input month : ");
        month = scanner.nextInt();
        
        double monthlyInterestRate = (annualInterestRate / 100.00 ) / 12;

        double savingAmount = 0.0;
        
        for(int i = 0; i < month; i++){
            if(i == 0){
                savingAmount = amount * (1 + monthlyInterestRate);
            }else{
                savingAmount = (amount + savingAmount) * (1 + monthlyInterestRate);
            }
        }
        
        System.out.println("Saving amount : "+savingAmount);
        
        scanner.close();
    }
}
