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
public class PhanSoDonVi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
       
        for(int t = 0; t < test; t++)
        {
            long tu = sc.nextLong();
            long mau = sc.nextLong();
            long res;
            while(true){
                if(mau % tu == 0){
                    System.out.println("1/" + (mau / tu));
                    break;
                }
                else{
                    res = mau/tu + 1;
                    System.out.print("1/" + res + " + ");
                    tu = tu * res - mau;
                    mau = mau* res;
                }
            }
        }
    }
    
}
