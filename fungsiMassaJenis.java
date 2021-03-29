import java.util.Scanner;
public class fungsiMassaJenis {
    public static void main(String[] args) {
        //deklarasi
        Scanner input = new Scanner(System.in);
        int massaJenisAir, volume, massa;

        //input nilai
        massaJenisAir = 1000;
        System.out.println("Masukan massa benda(kg)");
        massa = input.nextInt();
        System.out.println("Masukan volume(m^3)");
        volume = input.nextInt();

        //perhitungan
        hitungan(massa, volume);
        System.out.println("Massa jenis benda adalah " + hitungan(massa, volume));
        System.out.println("Massa jenis air adalah " + massaJenisAir);
        System.out.println(" ");

        //percabangan
        if (hitungan(massa, volume) < massaJenisAir) {
            System.out.println("Benda akan Terapung");
        }
        else if (hitungan(massa, volume) == massaJenisAir) {
            System.out.println("Benda akan melayang");
        }
        else {
            System.out.println("Benda akan tenggelam");
        }
    }
    public static int hitungan(int inputMassa, int inputVolume) {
        int hasil;
        hasil = inputMassa / inputVolume;
        return hasil;
    }
}
