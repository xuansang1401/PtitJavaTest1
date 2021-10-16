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
public class SoLienKe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        int test;
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
       
        for(int t = 0; t < test; t++)
        {
            long inp = sc.nextLong();
            if(lienke(inp)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    public static boolean lienke(long inp) {
        ArrayList<Long> ds = new ArrayList<>();
        long temp = inp;
        while(temp > 0){
            ds.add(temp % 10);
            temp /= 10;
        }
        Collections.reverse(ds);
        for(int i = 0; i < ds.size() - 1; i++){
            if(abs(ds.get(i) - ds.get(i + 1)) != 1){
                return false;
            }
        }
        return true;
    }
    
}
