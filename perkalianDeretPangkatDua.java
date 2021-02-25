import java.util.Scanner;

public class perkalianDeretPangkatDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasai
        int nilaiN;
        double jumlah = 0;
        int akhir;

        //inputan
        System.out.println("Masukan nilai N");
        nilaiN = input.nextInt();
        System.out.println(" ");

        //looping
        for(int i = 1; i <= nilaiN; i++ ) {
            jumlah = Math.pow(2, i);
            akhir = (int) jumlah;
            System.out.print(akhir + " x ");
        }
    }
}
