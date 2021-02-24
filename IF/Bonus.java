import java.util.Scanner;

public class Bonus {
    
    public static void main(String[] args) {
        
        // membuat variable belanja dan scanner
        int bonus = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input 
        System.out.print("Total harga barang: Rp ");
        bonus = scan.nextInt();

        // cek apakah dia belanja di atas 500000
        if ( bonus > 500000 ) {
            System.out.println("Selamat, anda mendapatkan bonus diskon sebesar 50%! ");
        }

        System.out.println("Terima Kasih Telah Berkunjung..");
    }
}
