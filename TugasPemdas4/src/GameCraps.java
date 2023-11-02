public class GameCraps {
    public static void main(String[] args) {
        boolean stillLooping = true;
        int previous = 0;

        while (stillLooping){
            int sum = rollDices();
            stillLooping = checkResult(sum, previous);
            if(previous == 0) previous = sum;
        }
    }

    public static int rollDices() {
		int dice1 = (int)(1 + Math.random() * 6);
		int dice2 = (int)(1 + Math.random() * 6);
		int sum = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		return sum;
	}

    public static boolean checkResult(int sum, int previous){
        boolean repeat = true;
        
        if ((sum == 7 || sum == 11) && previous == 0) {
            System.out.println("You win");
            repeat = false;
        } else if ((sum == 2 || sum == 3 || sum == 12) && previous == 0) {
            System.out.println("You lose");
            repeat = false;
        } else {
            if (sum == previous && previous != 0) {
                System.out.println("You win");
                repeat = false;
            } else if (sum == 7 && previous != 0) {
                System.out.println("You lose");
                repeat = false;
            }else{
                System.out.println("point is " + sum);
            }
        }

        return repeat;
    }
}
