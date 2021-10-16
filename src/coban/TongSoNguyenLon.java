package coban;

import java.math.BigInteger;
import java.util.Scanner;

public class TongSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a= in.nextBigInteger();
        BigInteger b= in.nextBigInteger();

        BigInteger c= a.add(b);
        System.out.println(c);
    }
}
