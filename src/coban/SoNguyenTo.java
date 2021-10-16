package coban;

import java.util.*;

public class SoNguyenTo {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int s = in.nextInt();

        while (s-->0){
            int t = in.nextInt();
            if (isPrimeNumber(t)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
