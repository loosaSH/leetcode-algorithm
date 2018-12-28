package leetcode;

/**
 * Created by solie_h on 2018/12/28.
 */
public class PlusOne66 {

    public int[] plusOne(int[] digits) {

        int[] digits2 = new int[digits.length + 1];

        for (int i = digits.length - 1; i == 0; i--) {
            digits2[i + 1] = 0;
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i]+1;
                return digits;
            }

        }
        digits2[0]=1;
        return digits2;

    }

}
