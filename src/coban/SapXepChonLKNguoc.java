package coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepChonLKNguoc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n= in.nextInt();

         int[]  a= new int[n];
         for (int i =0; i< n; i ++) {
             a[i] = in.nextInt();
         }

         sapXepChon(a, n);
    }


    private static void sapXepChon(int[] a, int n) {
        int i,j,t;
        ArrayList<String> ds= new ArrayList<>();
        for ( i =0; i< n-1; i ++){
           int min = i;
           for ( j =i+1; j <n;j ++){
               if (a[j]<a[min]) min=j;
           }
           t= a[i]; a[i]=a[min]; a[min]=t;
           String tmp ="Buoc "+ (i+1)+ ":";

           for (j =0; j<n; j++){
               tmp= tmp+" "+a[j];
           }
           ds.add(tmp);
        }

        Collections.reverse(ds);
        for (String s: ds){
            System.out.println(s);
        }
    }

    private static String printArr(int[] a){
        String s="";
        for (int i =0; i< a.length; i ++){
            s+= a[i]+" ";
        }
        return s;
    }

}
