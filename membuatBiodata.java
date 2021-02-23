import java.util.Scanner;

class membuatBiodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi
        String fullName, callName, placeOfBirth, bulanLahir;
        int age, tanggalLahiir, tahunLahir;

        //inputkan
        //inputan nama lengkap
        System.out.println("Masukan nama lengkap anda!");
        fullName = input.nextLine();
        //inputan nama panggilan
        System.out.println("Masukan nama panggilan anda!");
        callName = input.nextLine();
        //inputan tempat lahir
        System.out.println("Masukan tempat lahir!");
        placeOfBirth = input.nextLine();
        //inputan tanggal lahir
        System.out.println("Masukan tanggal lahir!");
        tanggalLahiir = input.nextInt();
        //inputan bulan lahir
        System.out.println("Tuliskan bulan lahir anda!");
        bulanLahir = input.next();
        //input tahun lahir
        System.out.println("Masukan tahun lahir anda!");
        tahunLahir = input.nextInt();
        //inputan umur
        System.out.println("Masukan umur anda!");
        age = input.nextInt();

        //output
        System.out.println("\n-------------------------------");
        System.out.println("Nama Lengkap : " + fullName);
        System.out.println("Nama Panggilan : " + callName);
        System.out.println("Tempat Tanggal Lahir : " + placeOfBirth + ", " + tanggalLahiir + " " + bulanLahir + " " + tahunLahir);
        System.out.println("Umur : " + age);
        System.out.println("-------------------------------");
    }
}