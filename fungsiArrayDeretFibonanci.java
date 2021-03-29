import java.util.Scanner;
import java.util.Arrays;

public class fungsiArrayDeretFibonanci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiN;
        
        //inputan
        System.out.println("inputkan nilai yang akan dicari");
        nilaiN = input.nextInt();

        long[] fibo = new long[nilaiN];
        fibo[0] = 0;
        fibo[1] = 1;

        //looping
        for(int i = 2; i  < fibo.length; i++) {

            fibo[i] = fibo[i - 1] + fibo[i - 2];
            //System.out.print(fibo[i] + " ");
        }
        System.out.println(" ");
        printArray(fibo);
    }
    //print array
    public static void printArray(long [] massukkanArray) {
        System.out.println(Arrays.toString(massukkanArray));
    }
}
