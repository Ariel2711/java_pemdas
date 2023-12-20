import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = scanner.nextInt();
        scanner.nextLine();
        String enkripsi = scanner.nextLine();

        if(cekDeskripsi(key))
            System.out.println(hasilDeskripsi(enkripsi ,key));
        else
            System.out.println("ERROR: Invalid key!");
        

        scanner.close();
    }

    public static boolean cekDeskripsi(int key){
        if (key < 1 || key > 100) 
            return false;
        else
            return true;
    }

    public static String hasilDeskripsi(String enkripsi, int key) {
        StringBuilder deskripsi = new StringBuilder();

        for (char c : enkripsi.toCharArray()) {
            int originalChar = (int) c;
            int deskripsiChar = 0;

            if (originalChar - key < 32)
                deskripsiChar = 127 + originalChar - 32 - key;
            else
                deskripsiChar = originalChar - key;

            deskripsi.append((char) deskripsiChar);
        }

        return deskripsi.toString();
    }
}