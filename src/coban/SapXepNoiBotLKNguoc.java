package coban;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SapXepNoiBotLKNguoc {

    static ArrayList<String> list;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        while (t-->0){
            list= new ArrayList<>();
            int n = in.nextInt();
            int[] a= new int[n];
            for (int i=0; i<n; i++){
                a[i]= in.nextInt();
            }

            sapXepNoiBot(a,n);

            Collections.reverse(list);
            for(String s: list){
                System.out.println(s);
            }
        }



    }

    private static void sapXepNoiBot(int[] a, int n) {
        boolean isSx=false;
        for (int i=0; i<n-1; i++){
            isSx=false;
            for (int j=0; j<n-i-1; j++){
                if (a[j] > a[j+1]){
                    int tem= a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                    isSx=true;
                }
            }

            if (!isSx){
                break;
            }
           list.add("Buoc "+(i+1)+": " +arrToString(a,n));
        }
    }


    private static String arrToString(int[] a, int n){
        String s="";
        for (int i=0; i<n;i++){
            s= s + a[i]+" ";
        }
        return s;
    }
}
