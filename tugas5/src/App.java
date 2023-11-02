import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Menghitung Karakter Vokal");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Teks : ");
        String input = scanner.nextLine();

        int a = 0, i = 0, u = 0, e = 0, o = 0;
        for(int index = i; index < input.length(); index++){
            switch(input.substring(index, index + 1).toLowerCase()){
                case "a" -> {
                    a++;
                }
                case "i" -> {
                    i++;
                }
                case "u" -> {
                    u++;
                }
                case "e" -> {
                    e++;
                }
                case "o" -> {
                    o++;
                }
            }
        }

        if(a > 0)System.out.println("a : "+a);
        if(i > 0)System.out.println("i : "+i);
        if(u > 0)System.out.println("u : "+u);
        if(e > 0)System.out.println("e : "+e);
        if(o > 0)System.out.println("o : "+o);


        scanner.close();
    }
}
