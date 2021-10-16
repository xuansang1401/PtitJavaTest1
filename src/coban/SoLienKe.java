package coban;

import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        while (t-->0){
            String s= in.next();
            System.out.println(soTamPhan(s));
        }
    }

    private static String soTamPhan(String s) {
        char[] a= s.toCharArray();
        for (int i=0; i<a.length;i++){
            if (a[i] > '2') {
                return "NO";
            }
        }

        return "YES";
    }
}
