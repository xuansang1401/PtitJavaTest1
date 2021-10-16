/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamkhaocoban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoKhoiLapPhuong {

    /**
     * @param args the command line arguments
     */
    static Map<Long, Boolean> d = new HashMap<Long, Boolean>();
    static int u[] = new int[21];
    static long res ;
    static ArrayList <Long> a = new ArrayList<>();
    public static void main(String[] args) {
     
       
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            for(long i = 0; i <= n; i++){
                    
                d.put(i, false);
            }
             for(long e = 0; e <= n; e++){

                d.put(e * e * e, true);
            }
            long temp = n;
            a.clear();
            while(temp > 0){
                a.add(temp %10);
                temp /= 10;
            }
            Collections.reverse(a);
            res = -1;
            dq(0, a.size());
            System.out.println(res);
        }
    }
    public static void dq(int i, int n){
        for(int j = 0; j <= 1; j++){
            u[i] = j;
            if(i == n - 1){
                long ans = 0;
                for(int l = 0; l < n; l++){
                    if(u[l] == 1) ans= 10 * ans + a.get(l);
                }
                if(d.get(ans) == true && ans != 0 && res < ans){
                    res = ans;
                }
            }
            else dq(i + 1, n);
        }
    }
}
