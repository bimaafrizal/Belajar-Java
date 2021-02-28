import java.util.Scanner;

class deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoAwal;
        double bunga;
        int tahun;


        //input
        System.out.println("Masukan nilai awal deposit anda!");
        saldoAwal = input.nextDouble();
        System.out.println("Masukan berapa tahun");
        tahun = input.nextInt();

        //bunga
        bunga = 0.05;

        //looping
        for(int i = 1; i <= tahun; i++) {
            saldoAwal = saldoAwal + (saldoAwal * bunga);
            System.out.println("Jumlah akhir setelah " + i + " adalah " + awal);
        }
    }
}