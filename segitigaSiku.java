import java.util.Scanner;

public class segitigaSiku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiN;
        
        //inputan
        System.out.println("Inputkan jumlah baris");
        nilaiN = input.nextInt();

        //looping
        for(int i = 1; i <= nilaiN; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");    
            }
        System.out.println("\n");
        }
    }
}
