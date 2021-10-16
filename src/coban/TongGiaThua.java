package coban;

import java.util.Scanner;

public class TongGiaThua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long[] f= new long[21];
        f[1]=1;
        f[2]=2;
        int n= in.nextInt();

        for (int i=2; i<=n; i++){
            f[i]= i*f[i-1];
        }
        long tong=0;
        for (int i=1; i<=n; i++){
            tong+=f[i];
        }
        System.out.println(tong);
    }
}
