package dequy;

import java.util.Arrays;
import java.util.Scanner;

public class DayConTongSoNguyenTo {
    static int[] a=new int[20], b= new int[20];
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        while (t-->0){
            b= new int[20]; a= new int[20];
            n=in.nextInt();
            int x[]= new int[n];
            for (int i=0; i<n;i++) x[i]=in.nextInt();

            Arrays.sort(x);
            for (int i=1;i<=n;i++){
                a[i]=x[n-i];
            }
            quaylui(1);


        }
    }

    private static void quaylui(int i) {
        for(int j=0;j<=1;j++){
            b[i]=j;
            if(i==n) xuly();
            else quaylui(i+1);
        }
    }

    private static void xuly() {
        int i, tong=0;
        for (i=1; i<=n;i++){
            if(b[i]==1) tong+=a[i];
        }
        if (nguyenTo(tong)){
            for ( i=1; i<=n; i++){
                if (b[i]==1){
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println();
        }
    }

    private static boolean nguyenTo(int tong) {
        if (tong<2) return false;
        for (int i=2; i<=Math.sqrt(tong);i++){
            if (tong%i==0) return false;
        }
        return true;
    }
}
