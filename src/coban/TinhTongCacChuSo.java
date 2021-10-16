package coban;

import java.util.Scanner;

public class TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n-- >0){
            String s= in.next();
//            System.out.println("next: "+s);
            System.out.println(tongChuSo(s));

        }
    }

    private static String tongChuSo(String s) {
        String[] str= new String[s.length()];
        String temp;
        String kq="";
        int count=0;
        int tong=0;
        for (int i=0; i< s.length(); i++){
            char c= s.charAt(i);
            str[i]=Character.toString(c);

            if (Character.isDigit(c)){
                int k =c -'0';
                tong= tong+k;
                count++;
            }
        }
//        System.out.println("Tong: "+tong);

        for (int i=0; i<s.length();i++){
            for (int j=i+1; j<s.length();j++){
                if (str[i].compareTo(str[j])>0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        for (int i = 0; i <= str.length - 1; i++)
        {
            kq=kq+str[i];
        }
        String t= kq.substring(count,s.length())+tong;
//        System.out.println(t);

        return t;
    }
}
