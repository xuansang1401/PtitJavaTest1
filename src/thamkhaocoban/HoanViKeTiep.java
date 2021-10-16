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
public class HoanViKeTiep {

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
            int arr[] = new int[n + 5];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            int i = n - 1;
            while(i > 0 && arr[i] > arr[i + 1])i--;
            if(i <= 0){
                for(int k = 0; k < n; k++) System.out.print((k + 1) + " ");
                System.out.println("");
            }
            else{
                int k = n - 1;
                while(arr[k] < arr[i]) k--;
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                int l = i + 1, r = n - 1;
                while(l < r){
                    int temp2 = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp2;
                    l++;
                    r--;
                }
                for(int m = 0; m < n; m++) System.out.print(arr[m] + " ");
                System.out.println("");
            }
        }
    }
    
}
