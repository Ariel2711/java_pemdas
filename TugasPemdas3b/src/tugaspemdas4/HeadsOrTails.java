package tugaspemdas4;

import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        System.out.println("Simulation: heads or tails");
        
        int heads = 0, tails = 0;
        
        Random random = new Random();
        
        for(int i = 1; i <= 100; i++){
            boolean isHead = random.nextBoolean();
            if(isHead){
                System.out.println(i+" result : Heads");
                heads++;
            }else{
                System.out.println(i+" result : Tails");
                tails++;
            }
        }
        
        System.out.println("Total Heads : "+heads);
        System.out.println("Total Tails : "+tails);
    }
}
