import java.util.Scanner;

class pangkat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double coba, hasil;
        System.out.println("Input pangkat");
        coba = input.nextDouble();

        hasil = coba * pangkat(10, -1);
        System.out.println(hasil);

    }
    private static double pangkat(double nilai, double pangkat) {
        double hasil;
        hasil = Math.pow(nilai, pangkat);
        return hasil;
    }
}