import java.util.Scanner;

public class methodDeretGanjilBagi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiN, beda, awal;

        System.out.println("Masukan nilai N");
        nilaiN = input.nextInt();
        System.out.println("Masukan awal");
        awal = input.nextInt();
        System.out.println("Masukan beda");
        beda = input.nextInt();

        deret(awal, beda, nilaiN);
    }
    //fungsi
    private static void deret(int awal, int beda, int nilai) {
        int maks = awal + (nilai-1) * beda;
        for(int i = awal; i <= maks; i += beda) {
            System.out.print(i + " ");
        }    
    }
}