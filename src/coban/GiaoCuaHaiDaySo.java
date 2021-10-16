package coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
         int[] a= new int[n];
         int[] b= new int[m];
         for (int i=0; i<n; i++){
             a[i]=in.nextInt();
         }
        for (int i=0; i<m; i++){
            b[i]=in.nextInt();
        }
        ArrayList<Integer> list=giaoHaiMang(a, b, n, m);
        Collections.sort(list);
        String t="";
        for (int i: list){
            t=t+i+" ";

        }
        System.out.println(t.trim());

    }

    private static ArrayList<Integer> giaoHaiMang(int[] a, int[] b, int n, int m) {
        ArrayList<Integer> arrayList= new ArrayList();
        for(int i=0; i<n; i++){
            for (int j=0; j<m;j++){
                if (a[i]==b[j]){
                    arrayList.add(a[i]);
                    break;
                }
            }
        }

        return arrayList;

    }


}
