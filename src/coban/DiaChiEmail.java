package coban;

import java.util.*;
import java.util.logging.Logger;

public class DiaChiEmail {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


        int n= Integer.parseInt(in.nextLine());
        String[] arr= new String[n];
        while (n-- >0){
            String s= in.nextLine();
            diaChiEmail(s,arr, n);

        }

    }

    private static void diaChiEmail(String s, String[] arr, int n) {
        StringBuilder sb= new StringBuilder();
        StringTokenizer tk = new StringTokenizer(s);

        int count = arr.length-n-1;
        while (tk.hasMoreTokens()){
            String t= tk.nextToken();

            if (tk.countTokens()==0){
                sb.insert(0,t.toLowerCase().trim());
            }else {
                sb.append(Character.toLowerCase(t.charAt(0)));
            }

        }

        String kq= sb.toString();
        arr[count]=kq;
        int size=1;
        for (int i=0; i< count+1; i++){
            if (i!=count) {
                if (kq.equals(arr[i].replaceAll("\\d", ""))) {
                    size++;
                }
            }
        }
        if (size>1){
            kq= kq+size;
        }

        System.out.println(kq+"@ptit.edu.vn");

    }
}
