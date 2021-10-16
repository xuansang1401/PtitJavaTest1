package quyhoachdong;

import java.util.Scanner;

public class DayConTangDaiNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[]= new int[n];

        for (int i=0; i<n; i++) a[i]= in.nextInt();

        System.out.println(qhd(a,n));
    }

    private static int qhd(int[] a, int n) {
        int f[]= new int[n+1];
        int i, j , kq=0;
        for (i=0;i<n;i++){
            f[i]=1;
            for (j=0; j<i; j++){
                if (a[j]< a[i]){
                    f[i]= Math.max(f[i], f[j]+ 1);
                }
            }
            kq=Math.max(kq,f[i]);
        }
        return kq;
    }

}
