import java.util.Scanner;

public class ChannelTv {
    
    public static void main(String[] args) {

        String channel;
        Scanner scan = new Scanner(System.in);

        // pilihan channel
        System.out.println("Daftar Channel:");
        System.out.println("1. RCTI");
        System.out.println("2. MNCTV");
        System.out.println("3. Global TV");

        // mengambil input
        System.out.print("Pilih Chanel TV: ");
        channel = scan.nextLine();

        switch(channel){
            case "1":
                  System.out.println("Channel RCTI");;
                  break;
            case "2":
                  System.out.println("Channel MNCTV");
                  break;
            case "3":
                  System.out.println("Channel Global TV");        
                  break;
            default:
                  System.out.println("Tidak dapat ditemukan");    
        }

    }
}
