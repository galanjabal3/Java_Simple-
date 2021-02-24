import java.util.Scanner;

public class HasilUlangan {
    public static void main(String[] aargs) {

        // membuat variabel dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        // cek apakah nilai dia melebihi 75
        if(nilai >= 75){
            System.out.println("Selamat " + nama + ", anda tidak mengikuti remedial!");
        } else {
            System.out.println("Maaf " + nama + ", anda harus mengikuti remedial!");
        }

    }
}
