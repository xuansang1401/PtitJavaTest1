package coban;

import java.util.Scanner;

public class UocSoNuyenToLN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0){
            long a= in.nextLong();
            System.out.println(usnt(a));;
        }
    }

    private static long usnt(long a) {
        long x=1;
        if (nguyenTo(a)){
            return a;
        }
        for (long i=2; i<Math.sqrt(a);i++){
            if (a%i==0) {

                if(nguyenTo(a/i)) return a/i;
                else if(nguyenTo(i)) x = i;
            }
        }
        return x;
    }

    private static boolean nguyenTo(long kq) {
        if (kq<2){
            return false;
        }

        for (long i=2 ;i<=Math.sqrt(kq); i++){
            if (kq%i==0) return false;
        }
        return true;
    }


}
