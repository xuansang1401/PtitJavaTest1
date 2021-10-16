package coban;

import java.util.Scanner;

public class SoDep {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n= Integer.parseInt(in.nextLine());

        while (n-- >0){
            String t= in.next();
            if (thuanNghich(t) && soChan(t)){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }

    private static boolean soChan(String t) {
        for (int i =0; i< t.length(); i++){
            char k = t.charAt(i);
            int so = k -'0';
            if (so%2==1){
                return false;
            }
        }
        return true;
    }

    private static boolean thuanNghich(String t) {
        StringBuilder sb= new StringBuilder(t);
        String dao= sb.reverse().toString();
        return dao.equals(t);
    }
}
