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
public class HopDaySo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int a[] = new int[n], b[] = new int[m];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
         for(int i = 0; i < m; i++)
        {
            b[i] = sc.nextInt();
        }
         int A[] = new int[1000], B[] = new int[1000];
         for(int i = 0; i < n; i++)
        {
           A[a[i]]++;
        }
          for(int i = 0; i < m; i++)
        {
            B[b[i]]++;
        }
        for(int i = 0; i < 1000; i++)
        {
            if(A[i] > 0 || B[i] > 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
