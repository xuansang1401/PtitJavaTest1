package coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepChenLKNguoc {
    static ArrayList<String> list= new ArrayList();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]= in.nextInt();
        }

        sapXepChen(arr, n);

        Collections.reverse(list);
        for (String i: list){
            System.out.println(i);
        }
    }

    private static void sapXepChen(int[] arr, int n) {
        int i, j;

        for (i = 0; i < n; i++) {
            String s = "Buoc " + (i) + ": ";
            int t=i;
            for(j =0; j<i+1; j++){
                if (arr[t] <arr[j]){
                    int tem = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }

            String s1="";
            for (int k = 0; k < i + 1; k++) {
//                strings.add(s + arr[k]);

                 s1+=  arr[k] +" ";

            }
            list.add( s+ s1);

        }
    }
}
