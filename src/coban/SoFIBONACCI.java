package coban;

import java.util.Scanner;

public class SoFIBONACCI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long f[]= new long[100];
        f[0]=0;f[1]=1;

        for (int i=2; i<92; i++){
            f[i]=f[i-1]+f[i-2];
        }

        int t= in.nextInt();

        while (t-->0){
            int n= in.nextInt();
            System.out.println(f[n]);
        }

    }
}
