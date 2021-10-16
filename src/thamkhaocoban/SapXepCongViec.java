/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamkhaocoban;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SapXepCongViec {

    /**
     * @param args the command line arguments
     */
    static class data {
    
        int fi;
        int se;
        public data(int fi, int se) {
            this.fi = fi;
            this.se = se;
        }
    }
    static ArrayList <data> h = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            h.clear();
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int f = sc.nextInt();
                int s = sc.nextInt();
                h.add(new data(f, s));
            }
            Collections.sort(h, new Comparator<data>() {
                @Override
                public int compare(data o1, data o2) {
               
                    return o1.se-o2.se;
                }
            });
            //Arrays.sort(h, cmp);
            int d = 1, j = 0;
            for(int k = 1; k < n; k++){
                if(h.get(k).fi >= h.get(j).se){
                    d++;
                    j = k;
                }
            }
            System.out.println(d);
        }
    }
    
}
