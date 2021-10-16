package coban;

import java.util.Scanner;

public class RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String xau = in.next();

        System.out.println(rutGon(xau));
    }

    private static String rutGon(String xau) {
        int n= xau.length();
        StringBuilder sb= new StringBuilder(xau);
        String[] str= new String[n];
        for (int i=0; i<n;i++){
            str[i]=Character.toString(xau.charAt(i));
        }

        gg(sb, n-1);
        if (sb.toString()==null || sb.toString().equals("")){
            return "Empty String";
        }
        return sb.toString();
    }

    private static StringBuilder gg(StringBuilder s, int n) {
        if (n==0){
            return s;
        }else {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s.delete(i, i+2);
                    return gg(s,n-1);
                }
            }

            return s;
        }
    }
}
