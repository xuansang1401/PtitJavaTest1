package coban;

import java.util.*;

public class ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= Integer.parseInt(in.nextLine());

        while (t-->0){
            String s= in.nextLine();
            System.out.println(chuanHoaChuoi(in.nextLine()));
        }


    }

    private static String chuanHoaChuoi(String s) {

        StringBuilder kq= new StringBuilder();
        StringTokenizer st= new StringTokenizer(s);
        while (st.hasMoreTokens()){
            String t = st.nextToken();
            System.out.println("token: "+ t);
            kq= kq.append(Character.toUpperCase(t.charAt(0)));

            System.out.println(kq +" s: "+t);
            for (int i =1; i< t.length(); i++){
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }

        return kq.toString().trim();
    }
}
