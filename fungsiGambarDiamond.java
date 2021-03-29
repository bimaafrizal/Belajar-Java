import java.util.Scanner;

public class fungsiGambarDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiN;
    
        System.out.println("Masukan nilai N");
        nilaiN = input.nextInt();

        for(int i = 1; i <= nilaiN; i++)
        {
            //Membuat Spasi
            spasi(nilaiN, i);

            //membuat bintang
            bintang(i);
            System.out.println(" ");
        }
        for(int i = nilaiN - 1; i >= 1; i--) {
            //membuat spasi
            spasi(nilaiN, i);
          
            //membuat bintang
            bintang(i);
            System.out.println(" ");
        }
    }
    public static void spasi(int banyakN, int awalLooping) {
        for(int j = 1; j <= banyakN - awalLooping; j++) {
            System.out.print(" ");
        }
    }
    public static void bintang(int awalLooping) {
        for(int k = 1; k <= 2 * awalLooping - 1; k++) {
            System.out.print("*");
        }
    }
}
