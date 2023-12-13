import java.util.Scanner;

/**
 * Percobaan6
 */
public class Percobaan6 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int p,l,t,L,vol;

    System.out.println("Masukan panjang");
    p=input.nextInt();
    System.out.println("Masukan lebar");
    l=input.nextInt();
    System.out.println("Masukan tinggii");
    t=input.nextInt();

    L= hitungLuas(p,l);
    System.out.println("Luas persegi panjang adalah " + L);
    vol = hitungVolume(t, p, l);
    System.out.println("Volume balok adalah "+ vol );
    }
    
    static int hitungLuas (int pjg, int lb) {
        int Luas=pjg * lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int Volume= hitungLuas(a,b) * tinggi;
        return Volume ;
    
}
  }
