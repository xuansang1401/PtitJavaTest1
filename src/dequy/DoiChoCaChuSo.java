package dequy;

import java.util.Scanner;

public class DoiChoCaChuSo {
    static   char[] chars, check;
    static int k ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();

        while (t-->0){
            k = in.nextInt();
            String s= in.next();
            chars= s.toCharArray();
            check= new char[10];
            doiCho(0);
        }
    }

    private static void doiCho(int n) {
        for (int i =0; i<chars.length;i++){
            check[i]=(char) i;
            if (n==k-1) xuLy();
            else doiCho(n+1);
        }
    }

    private static void xuLy() {


    }


}
