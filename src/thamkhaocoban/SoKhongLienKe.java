/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamkhaocoban;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoKhongLienKe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
       
        for(int t = 0; t < test; t++)
        {
            long inp = sc.nextLong();
            if(tongChiaHet10(inp) && lienKe2(inp)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    public static boolean tongChiaHet10(long inp) {
        long sum = 0;
        long temp = inp;
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        if(sum % 10 == 0){
            return true;
        }
        return false;
    }

    public static boolean lienKe2(long inp) {
        ArrayList<Long> ds = new ArrayList<>();
        long temp = inp;
        while(temp > 0){
            ds.add(temp % 10);
            temp /= 10;
        }
        Collections.reverse(ds);
        for(int i = 0; i < ds.size() - 1; i++){
            if(abs(ds.get(i) - ds.get(i + 1)) != 2){
                return false;
            }
        }
        return true;
    }
    
}
