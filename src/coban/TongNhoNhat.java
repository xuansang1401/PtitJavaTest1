package coban;

import java.util.Arrays;
import java.util.Scanner;

public class TongNhoNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        while (t-->0){
            int n= in.nextInt();
            int[] a= new int[n];
            for (int i=0; i<n; i++){
                a[i]=in.nextInt();
            }
            System.out.println(tongNhoNhat(a, n));

        }
    }

    private static long tongNhoNhat(int[] arr, int n) {
        Arrays.sort(arr);
        String a="",b="";
        for (int i =0; i<n;i++){
            if (arr[i]!=0){
                if (i%2==0){
                    a=a+arr[i];
                }else {
                    b=b+arr[i];
                }
            }
        }
        long s1= Long.parseLong(a);
        long s2= Long.parseLong(b);

        return (s2+s1);

    }

}
