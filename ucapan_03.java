import java.util.Scanner;

/**
 * ucapan_03
 */
public class ucapan_03 {

    public static String PenerimaUcapan(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
    String namaOrang = sc.nextLine();
    sc.close();
    return namaOrang;
    }
    
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama +"\n may The force be with you. ");
    }
}