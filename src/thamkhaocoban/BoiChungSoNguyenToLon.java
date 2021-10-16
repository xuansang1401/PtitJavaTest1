/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamkhaocoban;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BoiChungSoNguyenToLon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
       
        for(int t = 0; t < test; t++)
        {
     
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
    
}
