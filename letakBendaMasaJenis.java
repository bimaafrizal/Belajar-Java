import java.util.Scanner;

public class letakBendaMasaJenis {
    public static void main(String[] args) {
        //deklarasi
        Scanner input = new Scanner(System.in);
        int massaJenisBenda, massaJenisAir, volume, massa;

        //input nilai
        massaJenisAir = 1000;
        System.out.println("Masukan massa benda(kg)");
        massa = input.nextInt();
        System.out.println("Masukan volume(m^3)");
        volume = input.nextInt();

        //perhitungan
        massaJenisBenda = massa / volume;
        System.out.println("Massa jenis benda adalah " + massaJenisBenda);
        System.out.println("Massa jenis air adalah " + massaJenisAir);
        System.out.println(" ");

        //percabangan
        if (massaJenisBenda < massaJenisAir) {
            System.out.println("Benda akan Terapung");
        }
        else if (massaJenisBenda == massaJenisAir) {
            System.out.println("Benda akan melayang");
        }
        else {
            System.out.println("Benda akan tenggelam");
        }
    }
}
