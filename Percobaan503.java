/**
 * Percobaan503
 */
public class Percobaan503 {

    static void Tampil (String str, int... a) {
        System.out.println("String : " + str );
        System.out.println("Jumlah argumen/parameter : " + a.length);

        for (int i : a ) {
            System.out.print(1 + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Tampil("Dapro 2019",100,200);
        Tampil("Teknologi Informasi ", 1, 2, 3, 4, 5);
        Tampil("Polinema");
    }
}