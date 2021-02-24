import java.util.Scanner;

class deretHitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("Masukan jumlah angka bilangan ganjil yang di tampilkan!");
        angka = input.nextInt();

        //kondisi
        for(int x = 0; x <= angka * 2; x += 2) {
            System.out.print(x + " ");
        }

    }
}