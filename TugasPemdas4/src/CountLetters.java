import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args)
    {
        System.out.println("Count the letters in a string");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = scanner.nextLine();

        int result = countLetters(s);

        System.out.println("Total letters : "+result);

        scanner.close();
    }

    public static int countLetters(String s)
    {
        int letters = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)))
                letters++;
        return letters;
    }
}
