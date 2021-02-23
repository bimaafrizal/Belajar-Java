import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        //deklarasi
        Scanner input = new Scanner(System.in);
        int angka;

        //input angka
        System.out.println("Masukan angak yang ingin di cek ");
        angka = input.nextInt();

        //percabangan
        if(angka % 2 == 0) {
            System.out.println("Termasuk angka genap");
        }
        else {
            System.out.println("Termasuk angka ganjil");
        }
    }
}
