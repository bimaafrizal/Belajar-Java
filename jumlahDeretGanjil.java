import java.util.Scanner;
public class jumlahDeretGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //deklarasi
        int nilaiN;
        int jumlah = 0;

        //inputan
        System.out.println("Masukan jumlah dari banyak deret yang diinginkan!");
        nilaiN = input.nextInt();
        System.out.println(" ");

        //looping
        for(int i = 1; i <= nilaiN * 2; i++) {
            if(i % 2 == 1) {
                System.out.print(i + "  ");
                jumlah += i;
            }
        }
        System.out.println("\n");
        System.out.println("Jumlahnya adalah " + jumlah);
    }
}
