import java.util.*;

public class daftarNamaPeserta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = new String[10];
        boolean statusExit = false;
        int i = 0;

        do {
            System.out.println("Masukan pilihan anda!\n1. Input\n2. Tampilkan\n3. Exit\nChose:");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1 :
                    System.out.print("Input Name: ");
                    data[i] = input.next();
                    i++;
                    break;
                case 2 :
                    for (String x : data){
                        if(x != null) {
                            if (x.length() > 3) {
                                System.out.println(i);
                            }
                        }
                    }
                    break;
                case 3 :
                    System.out.println("Terimakasihsudah mencoba");
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
