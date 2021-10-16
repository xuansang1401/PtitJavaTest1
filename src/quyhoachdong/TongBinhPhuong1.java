package quyhoachdong;

import java.util.Scanner;

public class TongBinhPhuong1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0){
            int n= in.nextInt();
            System.out.println(qhd(n));
        }
    }

    private static int qhd(int n) {
        int i,j, f[]= new int[n+1];

        for ( i=1;i<=n;i++){
            f[i]=i;
        }

        for (i=2; i<=n;i++){
            for(j=1; j<=Math.sqrt(i); j++){
                if (j*j <=i){
                    f[i]=Math.min(f[i], f[i- j*j ]+1);
                }
            }
        }
        return f[n];
    }
}
