/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamkhaocoban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SapXepDoiChoTrucTiep {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a[] = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        sapxep(a, n);
    }
    public static void sapxep(int a[], int n){
        int i, j , t;
        ArrayList<String> ds = new ArrayList<>();
        for(i = 0; i < n - 1; i++){
            for(j = i + 1; j < n; j++){
                if(a[j] < a[i])
                {
                   int k = a[i];
                   a[i] = a[j];
                   a[j] = k;
                }
            }
            
            String tmp= "Buoc " + (i + 1) + ":";
            for(j = 0; j < n; j++){
               tmp = tmp + " " + a[j];
            }
            ds.add(tmp);
        }
        //Collections.reverse(ds);
        for(String s: ds){
            System.out.println(s);
        }
    }
}
