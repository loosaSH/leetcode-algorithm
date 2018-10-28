package leetcode;

import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 771 JewelsAndStones
 * Created by solie_h on 2018/10/28.
 */
public class JewelsAndStones {


    public static int numJewelsInStones(String J, String S) {

        int outPut = 0;

        Set set = new HashSet<Character>();


        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }

        for (int j = 0; j < S.length(); j++) {
            if (set.contains(S.charAt(j))) {
                outPut++;
            }
        }

        return outPut;

    }


    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }
}
