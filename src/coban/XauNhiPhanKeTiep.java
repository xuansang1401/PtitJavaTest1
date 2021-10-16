package coban;

import java.util.Scanner;

public class XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        while (n-->0){
            String s= in.next();
            congNhiPhan(s);
        }
    }

    private static void congNhiPhan(String s) {
        int[] a= new int[s.length()];
        StringBuilder b= new StringBuilder();
        for (int i= 0; i<s.length(); i++){
            a[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int cout=1;
        for(int i =a.length-1; i>=0; i--){
            if (a[i]+cout==2){
                b.append(0);
                cout=1;
            }else {
                b.append(a[i]+cout);
                cout=0;
            }
        }

        System.out.println(b.reverse().toString());
    }
}
