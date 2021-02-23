import java.util.Scanner;

public class gayaListrikStatik {
    public static void main(String[] args) {
        //import inputan
        Scanner input = new Scanner(System.in);

        //deklarasi
        double Force, konstanta, muatan1, muatan2, jarak, jarakAkhir;

        //inputan
        System.out.println("Masukan nilai Q1");
        muatan1 = input.nextDouble();
        System.out.println("Masukan nilai Q2");
        muatan2 = input.nextDouble();
        System.out.println("Masukan jarak dua muatan");
        jarak = input.nextDouble();

        //perhitungan pangkat
        konstanta = 9 * pangkat(10, 9);
        muatan1 = muatan1 * pangkat(10, -6);
        muatan2 = muatan2 * pangkat(10, -6);
        jarakAkhir = pangkat(jarak, 2);

        //rumus
        Force = konstanta * (muatan1 * muatan2) / jarakAkhir;

        //output
        System.out.println("Hasil gaya listrik static adalah " + Force);
    }
    //fungsi pangkat
    private static double pangkat(double nilai, double pangkat) {
        double hasil;
        hasil = Math.pow(nilai, pangkat);
        return hasil;
    }    
}
