import java.util.Scanner;

class membuatGambar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar;

        //input
        System.out.println("Inputkan panjang");
        panjang = input.nextInt();
        System.out.println("Inputkan lebar");
        lebar = input.nextInt();

        //gambar
        for(int i = 0; i < panjang ; i++) {
            for(int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}