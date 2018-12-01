package leetcode;

import java.util.Stack;

/**
 * Created by solie_h on 2018/11/28.
 */
public class BracketsisValid20 {

    public static boolean isValid(String s) {

        char b;
        char c;

        Stack a = new Stack();

        if (s.length() == 0) {
            return true;
        }

        a.push(s.charAt(0));

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            b = s.charAt(i);
            if (a.size()==0){
                a.push(b);
                continue;
            }
            c = (char) a.lastElement();
            if (b == ')' && c == '(' || b == ']' && c == '[' || b == '}' && c == '{') {
                a.pop();
            } else {
                a.push(b);
            }
        }

        if (a.empty()) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
