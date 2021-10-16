package dequy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HoanVXauKiTu {
    static int n;
    static boolean b[];

    static char[] c,a;
    static ArrayList<String> list;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            String s= in.next();
            n = s.length();
            b = new boolean[n];
            c=s.toCharArray();
            a = new char[11];
            list = new ArrayList<>();
            hoanVi(0);

            for (String i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void hoanVi(int k) {
        for (int j = 0; j < n; j++) {
            if (!b[j]) {
                a[k] = c[j ];
                b[j] = true;
                if (k == n - 1) result();
                else hoanVi(k + 1);
                b[j] = false;
            }

        }
    }

    private static void result() {
        String t = "";
        for (int i = 0; i < n; i++) {
            t += a[i];
        }
        list.add(t);

    }


}
