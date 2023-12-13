import java.util.Scanner;

/**
 * ucapanterimakasih03
 */
public class ucapanterimakasih03 {
    public static String PenerimaUcapan(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan ");
    String namaOrang = sc.nextLine();
    sc.close();
    return namaOrang;
    }
public static void ucapanterimakasih03(){
    String nama = PenerimaUcapan();
    System.out.println("Thank you "+nama+" for being the best teacher in the world.\n" +
     " You inspired in me a love for learning and made me feel like i could ask you anything. ");
 }
public static void ucapanTambahan(String tambahan) {
    System.out.println("Semoga sehat selalu  ");
}
public static void main(String[] args) {
    ucapanterimakasih03();
}
}