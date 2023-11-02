package tugaspemdas3;

//deklarasi class
public class DivisibleNumber {
    //deklarasi main method
    public static void main(String[] args) {
        //judul program
        System.out.println("Find numbers divisible by 5 and 6");
        
        //deklarasi nama variabel
        int countLoop = 0;
        
        //perulangan angka dari 100 sampai 1000
        for(int index = 100; index <= 1000; index++){
            //pengkondisian untuk menampilkan output angka jika habis dibagi dengan 5 atau 6
            if(index % 5 == 0 || index % 6 == 0){
                //tampilkan output angka
                System.out.print(index+" ");
                //nilai variabel countLoop bertambah satu setiap perulangan
                countLoop++;
                
                //pengkondisian untuk mengecek apakah nilai variabel countLoop sama dengan 10
                if(countLoop == 10){
                    //membuat baris baru
                    System.out.println();
                    //mereset nilai variabel countLoop kembali ke 0
                    countLoop = 0;
                }
            }
        }
    }
}