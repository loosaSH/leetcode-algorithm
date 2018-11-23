package leetcode;

import sun.security.provider.Sun;
import sun.security.util.Length;

/**
 * Created by solie_h on 2018/11/23.
 */
public class RomanToInt13 {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }


    public static int romanToInt(String s) {

        int[] stack = new int[s.length()];
        char c;
        int index = 0;
        int sum = 0;

        for (index = 0; index < s.length(); index++) {

            c = s.charAt(index);


            if (c == 'I') {
                if (index == s.length() - 1) {
                    return sum + 1;
                } else if (s.charAt(index + 1) == 'V') {
                    sum += 4;
                    index++;
                } else if (s.charAt(index + 1) == 'X') {
                    sum += 9;
                    index += 1;
                } else {
                    sum += 1;
                }
            } else if (c == 'X') {
                if (index == s.length() - 1) {
                    return sum + 10;
                } else if (s.charAt(index + 1) == 'L') {
                    sum += 40;
                    index++;
                } else if (s.charAt(index + 1) == 'C') {
                    sum += 90;
                    index++;
                } else {
                    sum += 10;
                }
            } else if (c == 'C') {
                if (index == s.length() - 1) {
                    return sum + 100;
                } else if (s.charAt(index + 1) == 'D') {
                    sum += 400;
                    index++;
                } else if (s.charAt(index + 1) == 'M') {
                    sum += 900;
                    index++;
                } else {
                    sum += 100;
                }
            } else if (c == 'V') {
                sum += 5;
            } else if (c == 'L') {
                sum += 50;
            } else if (c == 'D') {
                sum += 500;
            } else if (c == 'M') {
                sum += 1000;
            }

        }

        return sum;
    }


}
