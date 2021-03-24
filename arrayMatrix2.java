import java.util.Scanner;
public class arrayMatrix2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, m, n, jumlah = 0;
        int matriks1[][] = new int[10][10];
        int matriks2[][] = new int[10][10];
        int hasil[][] = new int[10][10];
        boolean statusExit = false;
    
    
        System.out.print("Masukkan jumlah baris matriks: ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        n = scan.nextInt();

        do{
            System.out.println("Masukan pilihan anda!\n1. Penjumlahan\n2. Kurang\n3. Perkalian\n4. Exit\nChose:");
            int pilihan = scan.nextInt();
            switch(pilihan){
                case 1  :
                    System.out.println("Masukkan elemen matriks pertama: ");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            matriks1[i][j] = scan.nextInt();
                        }
                    }
                    System.out.println("Masukkan elemen matriks kedua: ");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                        matriks2[i][j] = scan.nextInt();
                        }
                    }
                    System.out.println("Hasil penjumlahan matriks: ");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                        hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                        }
                    System.out.println();
                    }
                case 2  :
                    System.out.println("Masukkan elemen matriks pertama: ");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            matriks1[i][j] = scan.nextInt();
                        }
                    }
        
                    System.out.println("Masukkan elemen matriks kedua: ");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                matriks2[i][j] = scan.nextInt();
                            }
                        }
                    System.out.println("Hasil pengurangan matriks: ");
                        for (i = 0; i < m; i++) {
                            for (j = 0; j < n; j++) {
                                hasil[i][j] = matriks1[i][j] - matriks2[i][j];
                                System.out.print(hasil[i][j] + "\t");
                            }
                        System.out.println();
                        }
                case 3  :
                System.out.println("Masukkan elemen matriks pertama: ");
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        matriks1[i][j] = scan.nextInt();
                    }
                }
    
                System.out.println("Masukkan elemen matriks kedua: ");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            matriks2[i][j] = scan.nextInt();
                        }
                    }
                System.out.println("Hasil pengurangan matriks: ");
                    for (i = 0; i < m; i++) {
                        for (j = 0; j < n; j++) {
                            hasil[i][j] = matriks1[i][j] * matriks2[i][j];
                            System.out.print(hasil[i][j] + "\t");
                        }
                    System.out.println();
                    }

                case 4  :
                    System.out.println("Terimakasih sudah mencoba");
                    statusExit = true;
                    break;
                default :
                    System.out.println("Eror");
                    statusExit = true;
                    break;  
            }
        }
        while(!statusExit);
    }
}
