import java.util.Scanner;

class bmiDenganSyarat {
    public static void main(String[] args) {
        //deklarasi
        Scanner input = new Scanner(System.in);
        float berat;
        float tinggi;
        float BMI;

        //input
        System.out.println("Masukan berat badan anda");
        berat = input.nextFloat();
        System.out.println("Masukan tinggi anda");
        tinggi = input.nextFloat();

        //perhitungan
        BMI = berat / (tinggi * tinggi);
        System.out.println("BMI anda adalah " + BMI);

        //percabangan
        if (BMI >= 30) {
            System.out.println("Obese");
        } else if (BMI > 25) {
            System.out.println("Overwight");
        } else if (BMI > 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }
    }
}