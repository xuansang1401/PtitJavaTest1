package coban;

import java.util.Scanner;

public class J01011BSCUSC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        while (n-- >0){
            int a= in.nextInt();
            int b= in.nextInt();

            System.out.println(BSCNN(a, b)+" "+USCLN(a, b));


        }
    }

    public static long USCLN(long a, long b) {
        long temp1 = a;
        long temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        return temp1;
    }

    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }

}
