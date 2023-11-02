import java.util.Scanner;

public class Utp1revisi {
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

        if(berat <= 0 || berat > 2000){
            System.out.println("Berat tidak sesuai ketentuan!");
            valid = false;
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
        }

        if(berat > 100){
            hariKirim += 5;
            harga += 30000.0;
        }else if(berat > 50){
            hariKirim += 3;
            harga += 20000.0;
        }else if(berat > 20){
            hariKirim += 1;
            harga += 10000.0;
        }

        int hari = 0, bulan = 0, tahun = 0;

        if(tanggal.length() == 10){
            try {
                hari = Integer.parseInt(tanggal.substring(0, 2));
                bulan = Integer.parseInt(tanggal.substring(3, 5));
                tahun = Integer.parseInt(tanggal.substring(6, 10));
            }catch(NumberFormatException e){
                System.out.println("Input tanggal tidak sesuai!");
                valid = false;
            }
        }else{
            System.out.println("Input tanggal tidak sesuai!");
            valid = false;
        }

        if(valid){
            hari += hariKirim;
    
            switch(bulan){
                case 1 -> {
                    if(hari % 31 > 0){
                        hari = hari % 31;
                        bulan++;
                    }
                }
                case 2 -> {
                    if(tahun % 4 == 0){
                        if(hari % 29 > 0){
                        hari = hari % 29;
                        bulan++;
                        }
                    }else{
                        if(hari % 28 > 0){
                        hari = hari % 28;
                        bulan++;
                        }
                    }
                }
                case 3 -> {
                    if(hari % 31 > 0){
                        hari = hari % 31;
                        bulan++;
                    }
                }
                case 4 -> {
                    if(hari % 30 > 0){
                        hari = hari % 30;
                        bulan++;
                    }
                }
                case 5 -> {
                    if(hari % 31 > 0){
                        hari = hari % 31;
                        bulan++;
                    }
                }
                case 6 -> {
                    if(hari % 30 > 0){
                        hari = hari % 30;
                        bulan++;
                    }
                }
                case 7 -> {
                    if(hari % 31 > 0){
                        hari = hari % 31;
                        bulan++;
                    }
                }
                case 8 -> {
                    if(hari % 31 > 0){
                        hari = hari % 31;
                        bulan++;
                    }
                }
                case 9 -> {
                    if(hari % 30 > 0){
                        hari = hari % 30;
                        bulan++;
                    }
                }
                case 10 -> {
                    if(hari % 31 > 0){
                        hari = hari % 31;
                        bulan++;
                    }
                }
                case 11 -> {
                    if(hari % 30 > 0){
                        hari = hari % 30;
                        bulan++;
                    }
                }
                case 12 -> {
                    if(hari % 31 > 0){
                        hari = hari % 31;
                        bulan = 1;
                        tahun++;
                    }
                }
            }
        }


        if(valid == true){
            System.out.println("Nama barang: "+nama);
            System.out.println("Tanggal sampai barang: "+hari+"/"+bulan+"/"+tahun);
            System.out.print("Biaya pengiriman: ");
            System.out.printf("Rp %,.2f", harga);
        }

        scanner.close();
    }
}
