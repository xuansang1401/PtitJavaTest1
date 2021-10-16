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
public class ToHopKeTiep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();

        for (int t = 0; t < test; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[41];
            int brr[] = new int[41];
            int A[] = new int[41];
            for(int m = 1; m <= k; m++){
                arr[m] = sc.nextInt();
                brr[m] = arr[m];
                A[arr[m]]++;
            }
            int i = k;
            while(i > 0 && brr[i] == n - k + i ) i--;
            brr[i] ++;
            if(i > 0){
                for(int j = i + 1; j <= n; j++){
                    brr[j] = brr[i]+ j - i;
                    
                }
            }
            for(int m = 1; m <= k; m++){
               
                A[brr[m]]++;
            }
            int td = 0;
            for(int h = 1; h < 41; h++){
                if(A[h] >= 1){
                    td++;
                }
            }
            int res = td - k;
            if(res == 0){
                res = k;
            }
            System.out.println(res);
        }
    }
    
}
