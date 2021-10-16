package quyhoachdong;

import java.util.Scanner;

public class BacThang {

    static int mod=(int)1e9+7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        while (t-->0){
            int n= in.nextInt(), k= in.nextInt();

            int f[]= new int[n+5];
            f[0]=1;f[1]=1;

            for (int i=2; i<=n; i++){
                for (int j=1; j<=Math.min(i,k); j++){
                    f[i]=( f[i] + f[i-j] )%mod;
                }
            }

            System.out.println(f[n]);
        }
    }
}
