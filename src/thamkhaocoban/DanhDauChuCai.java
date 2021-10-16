/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamkhaocoban;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhDauChuCai {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String chuoi = sc.next();
        int dem = 0;
        char A[] = new char[1000];
        for(int i = 0; i < chuoi.length(); i++){
            A[chuoi.charAt(i)] ++;
        }
        for(int i = 0; i < 1000; i++){
           if(A[i] != 0){
               dem++;
           }
        }
        System.out.println(dem);
    }

    
}
