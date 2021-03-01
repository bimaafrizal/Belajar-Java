import java.util.Scanner;

public class gambarDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiN;
    
        System.out.println("Masukan nilai N");
        nilaiN = input.nextInt();

        for(int i = 1; i <= nilaiN; i++)
        {
            //Membuat Spasi
            for(int j = 1; j <= nilaiN-i; j++) {
                System.out.print(" ");
            }
            //membuat bintang
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");    
            }
            System.out.println(" ");
        }
        for(int i = nilaiN - 1; i >= 1; i--) {
            //membuat spasi
            for(int k = 1; k <= nilaiN - i; k++) {
                System.out.print(" ");
            }
            //membuat bintang
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
