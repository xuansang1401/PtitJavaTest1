package quyhoachdong;

import java.util.Scanner;

public class CaiTui {
    //gia tri C
    //the tich A
    static int f[][], a[], c[], n,v;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        while (t-->0){
            f= new int[1005][1005];//mang ket qua
            a=new  int[1005]; c=new  int[1005];
            n= in.nextInt(); // soo luong thanh phanf
            v= in.nextInt(); // the tich

            for (int i=0; i<n;i++) a[i]=in.nextInt();
            for (int i=0; i<n;i++) c[i]=in.nextInt();

            System.out.println(qhd());
        }
    }

    private static int qhd() {

        int i, j;
        for(i=1; i<=n;i++){
            for (j=1; j<=v;j++){
                f[i][j]= f[i-1][j];
                if (j>=a[i]) f[i][j]=Math.max(f[i][j],f[i-1][j-a[i]]+c[i]);
            }
        }
        return f[n][v];
    }
}
