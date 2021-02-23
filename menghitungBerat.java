import java.util.Scanner;

public class menghitungBerat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //deklarasi
        float berat, gravitasi;
        int massa;
        //input nilai
        gravitasi = 9.8f;
        System.out.println("Masukan nilai m yang ingin dihitung (kilogram)");
        massa = input.nextInt();
        
        //perhitungan
        System.out.println("Rumus w = m x g");
        System.out.println(" ");
        berat = massa * gravitasi;

        //output
        System.out.println("Nilai w dari m " + massa + " adalah " + berat + " kilogram");
    }
    
}
