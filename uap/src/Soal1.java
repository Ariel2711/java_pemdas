import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        if(cekLengthUsernameMin5(username) && cekUsernameNoSpasi(username)){
            System.out.println("Username valid.");
        }else{
            System.out.println("Username tidak valid:");
            if(!cekLengthUsernameMin5(username))
                System.out.println("Panjang username harus minimal 5 karakter.");
            if(!cekUsernameNoSpasi(username))
                System.out.println("Username tidak boleh mengandung spasi.");
            System.out.println();
        }
        

        if(cekLengthPasswordMin8(password) && cekKapitalPassword(password)){
            System.out.println("Password valid.");
        }else{
            System.out.println("Password tidak valid:");
            if(!cekLengthPasswordMin8(password))
                System.out.println("Panjang password harus minimal 8 karakter.");
            if(!cekKapitalPassword(password))
                System.out.println("Password harus diawali dengan huruf kapital.");
        }

        scanner.close();
    }

    public static boolean cekLengthUsernameMin5(String username) {
        return username.length() >= 5 ? true : false;
    }

    public static boolean cekUsernameNoSpasi(String username) {
        return !username.contains(" ") ? true : false;
    }

    public static boolean cekLengthPasswordMin8(String password) {
        return password.length() >= 8 ? true : false;
    }

    public static boolean cekKapitalPassword(String password) {
        return Character.isUpperCase(password.charAt(0)) ? true : false;
    }
}