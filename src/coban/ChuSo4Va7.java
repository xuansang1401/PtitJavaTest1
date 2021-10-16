package coban;

import java.util.Arrays;
import java.util.Scanner;

public class ChuSo4Va7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n= in.next();

        System.out.println(checkSo(n));
    }

    private static String checkSo(String n) {
        char[] t=n.toCharArray();
        int dem =0;
        for (int i=0; i<t.length;i++){
            if (t[i]=='4' || t[i]=='7'){
                dem++;
            }
        }
        if (dem==4 || dem==7){
            return "YES";
        }
        return "NO";
    }
}
