package coban;

import java.util.Scanner;

public class Giao2DS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        int A[] = new int[1000], B[] = new int[1000];
        for (int i = 0; i < n; i++) {
            A[a[i]]++;

        }
        for (int i = 0; i < m; i++) {
            B[b[i]]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (A[i] > 0 && B[i] > 0) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}