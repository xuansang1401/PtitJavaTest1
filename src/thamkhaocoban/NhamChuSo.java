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
public class NhamChuSo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        int a1min[] = new int[8];
        int a2min[] = new int[8];
        int a1max[] = new int[8];
        int a2max[] = new int[8];
        int summin1 = 0, summax1 = 0, summin2 = 0, summax2 = 0;
        
        int temp1 = s1;
        while (temp1 > 0) {
            a1.add(temp1 % 10);
            temp1 /= 10;
        }
        Collections.reverse(a1);
        
        int temp2 = s2;
        while (temp2 > 0) {
            a2.add(temp2 % 10);
            temp2 /= 10;
        }
        Collections.reverse(a2);
        
        for(int i = 0; i < a1.size(); i++){
            a1min[i] = a1.get(i);
            a1max[i] = a1.get(i);
        }
        
        for(int i = 0; i < a2.size(); i++){
            a2min[i] = a2.get(i);
            a2max[i] = a2.get(i);
        }
        
        for(int i = 0; i < a1.size(); i++){
            if(a1min[i] == 6){
                a1min[i] = 5;
            }
            if(a1max[i] == 5){
                a1max[i] = 6;
            }
        }
        for(int i = 0; i < a2.size(); i++){
            if(a2min[i] == 6){
                a2min[i] = 5;
            }
            if(a2max[i] == 5){
                a2max[i] = 6;
            }
        }
        for(int i = 0; i < a1.size(); i++){
            summin1 = summin1*10 + a1min[i];
            summax1 = summax1* 10 + a1max[i];
        }
        for(int i = 0; i < a2.size(); i++){
            summin2 = summin2*10 + a2min[i];
            summax2 = summax2* 10 + a2max[i];
        }
        
        System.out.println((summin1 + summin2) + " " +(summax1 + summax2));
    }
    
}
