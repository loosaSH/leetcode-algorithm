package leetcode;

/**
 * 32 Longest Valid Parentheses
 * Created by solie_h on 2018/11/6.
 */
public class LongestValidParentheses32 {

    @SuppressWarnings("Duplicates")
    public static int test(String s) {

        // 左括号计数，当左括号等于又括号数量时清零
        int left = 0;
        // 左括号计数
        int right = 0;

        int currentLength = 0;

        int maxLength = 0;

        int lastLength = 0;


        for (int i = 0; i < s.length(); i++) {

            // 分别计数
            if ('(' == s.charAt(i)) {
                left++;
            } else {
                right++;
            }

            if (right == left) { // 括号成对，记录累加当前的成对数量，并对left和right清零
                currentLength = currentLength + left * 2;
                maxLength = Math.max(maxLength, currentLength);
                left = 0;
                right = 0;
            } else if (right > left) { // 只有第一个字符是')' 或成对后的第一个字符是')'的情况
                // 本次括号成对不满足要求，进行下一组括号的判断
                currentLength = 0;
                // 对本次有括号增加计数清零
                right = 0;
            }


        }

        lastLength = left + right;
        currentLength = 0;

        // 如果最后的部分大于maxLength在进行最后一部分成对的数量判断。
        // 可以确定此时 '('比')'括号数量多,则对最后的这一部分反向遍历
        // 同时用相反的规则判断
        if (lastLength > maxLength) {
            left = 0;
            right = 0;

            for (int j = s.length() - 1; j > s.length() - lastLength; j--) {
                // 分别计数
                if ('(' == s.charAt(j)) {
                    left++;
                } else {
                    right++;
                }

                if (left == right) {
                    currentLength = currentLength + right * 2;
                    maxLength = Math.max(maxLength, currentLength);
                    left = 0;
                    right = 0;
                } else if (left > right) {
                    currentLength = 0;
                    left = 0;
                }
            }

        }

        return maxLength;

    }


    public static void main(String[] args) {

        System.out.println(test("()((()(()"));

    }
}
