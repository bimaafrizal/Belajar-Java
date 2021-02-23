import java.util.Scanner;

class menghitungBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat;
        double tinggi;
        double BMI;

        System.out.println("Masukan berat badan anda");
        berat = input.nextDouble();
        System.out.println("Masukan tinggi anda");
        tinggi = input.nextDouble();

        BMI = berat / (tinggi * tinggi);
        System.out.println("BMI anda adalah " + BMI);
    }
}
