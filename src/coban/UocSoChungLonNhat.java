package coban;

import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(USCLN(a,b));
        System.out.println(BSCNN(a,b));
    }

    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }


    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
