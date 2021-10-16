package coban;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i, in.nextInt());
        }

        thuGon(list, true);
        System.out.println(list.size());
    }

    private static ArrayList thuGon(ArrayList<Integer> list, boolean b) {
        ArrayList arr = list;
        Boolean isLoad= true;
        if (!b || list.size()<2) {
            return arr;
        }else {
            for (int j = 0; j < arr.size()-1; j++) {
                int k =(int)arr.get(j)+ (int)arr.get(j+1);
                if (k%2==0) {
                    arr.remove(j + 1);
                    arr.remove(j);
                    isLoad=true;
                    return thuGon(arr, isLoad);
                }
                isLoad=false;
            }
            return thuGon(arr, isLoad);
        }
    }


}
