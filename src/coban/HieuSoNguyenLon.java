package coban;

import java.math.BigInteger;
import java.util.*;

public class HieuSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       BigInteger a= in.nextBigInteger();

       BigInteger b = in.nextBigInteger();

       BigInteger kq = a.subtract(b);
        System.out.println(kq);
    }
}
