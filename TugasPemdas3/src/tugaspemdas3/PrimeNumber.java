package tugaspemdas3;

//deklarasi class
public class PrimeNumber {
    //deklarasi main method
    public static void main(String[] args) {
        //judul program
        System.out.println("Display prime numbers between 2 and 1.000");
        
        //deklarasi variabel
        int countPrime = 0;
        
        //perulangan angka dari 2 sampai 1000
        for(int number = 2; number <= 1000; number++){
            //variabel untuk menyimpan nilai apakah angka termasuk bilangan prima, nilai default true
            boolean isPrime = true;
            //perulangan untuk mengecek apakah nilai variabel number termasuk prima
            for(int divisor = 2; divisor <= number/2; divisor++){
                //pengkondisian untuk mengecek jika nilai variabel number bukan termasuk prima
                if(number % divisor == 0){
                    //jika bukan prima nilai variabel isPrime diubah menjadi false
                    isPrime =  false;
                    //jika bukan prima hentikan proses looping
                    break;
                }
            }
            
            //pengkondisian untuk mengecek variabel number apakah termasuk prima menggunakan variabel isPrime
            if(isPrime){
                //pengkondisian untuk mengecek nilai countPrime apakah sama dengan 8
                if(countPrime == 8){
                    //membuat baris baru
                    System.out.println("");
                    //mereset nilai variabel countPrime kembali ke 0
                    countPrime = 0;
                }
                //menampilkan output angka prima
                System.out.print(number+" ");
                //nilai variabel countPrime bertambah satu setiap perulangan
                countPrime++;
            }
        }
    }
}