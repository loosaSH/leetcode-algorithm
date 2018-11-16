package leetcode;

import com.sun.scenario.effect.Offset;

/**
 * Created by solie_h on 2018/11/16.
 */
public class NumDeletekMaximum {


    public static String removeKDigits(String num, int k) {

        int resultLength = num.length() - k;

        char[] stack = new char[num.length()];

        int top = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            while (top > 0 && stack[top - 1] > c && k > 0) {
                top = top - 1;
                k = k - 1;
            }

            stack[top++] = c;

        }

        int offset = 0;
        while (offset < resultLength && stack[offset] == '0') {
            offset++;
        }


        return offset == resultLength ? "0" : new String(stack, offset, resultLength - offset);
    }


    public static void main(String[] args) {
        System.out.println(removeKDigits("17287", 2));
    }

}
