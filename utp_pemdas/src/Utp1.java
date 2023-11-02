import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Utp1 {
    public static void main(String[] args) throws Exception {
        String nama, tipe, tanggal;
        Double berat, harga = 0.0;
        int hariKirim = 0;
        Scanner scanner =  new Scanner(System.in);
        nama = scanner.nextLine();
        berat = scanner.nextDouble();
        scanner.nextLine();
        tipe = scanner.nextLine();
        tanggal = scanner.nextLine();
        boolean valid = true;

        if(berat < 0 || berat > 2000){
            System.out.println("Berat tidak sesuai ketentuan!");
            valid = false;
            // System.exit(0);
        }

        if(tipe.equalsIgnoreCase("regular")){
            harga = 10000.0;
            hariKirim = 5;
        }else if(tipe.equalsIgnoreCase("express")){
            harga = 20000.0;
            hariKirim = 3;
        }else if(tipe.equalsIgnoreCase("super")){
            harga = 50000.0;
            hariKirim = 1;
        }else{
            System.out.println("Pilihan ekspedisi tidak valid!");
            valid = false;
            // System.exit(0);
        }

        if(berat > 20.0){
            hariKirim += 1;
            harga += 10000.0;
        }else if(berat > 50.0){
            hariKirim += 3;
            harga += 20000.0;
        }else if(berat > 100.0){
            hariKirim += 5;
            harga += 30000.0;
        }

        String hariSampai = "";

        SimpleDateFormat sdfinput = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfoutput = new SimpleDateFormat("dd/M/yyyy");

        try {
            int tahun = Integer.parseInt(tanggal.substring(6, 10));
            int bulan = Integer.parseInt(tanggal.substring(3, 5));
            int hari = Integer.parseInt(tanggal.substring(0, 2));
            Date date = sdfinput.parse(tanggal);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, hariKirim); 

            Date hariBaru = calendar.getTime(); 

            hariSampai = sdfoutput.format(hariBaru);
        }catch(NumberFormatException e){
            System.out.println("Input tanggal tidak sesuai!");
            valid = false;
            // System.exit(0);
        }

        if(valid == true){
            System.out.println("Nama barang: "+nama);
            System.out.println("Tanggal sampai barang: "+hariSampai);
            System.out.print("Biaya pengiriman: ");
            System.out.printf("Rp %,.2f", harga);
        }

        scanner.close();
    }
}
