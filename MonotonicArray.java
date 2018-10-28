package leetcode;

/**
 * leetcode 896
 * Created by solie_h on 2018/10/12.
 */
public class MonotonicArray {

    public static boolean isMonotonic(int[] A) {

        if (A == null || A.length < 1) {
            return false;
        }

        int increaseTag = -1; //初始值-1，递增1 递减0

        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {   // 递减
                if (increaseTag == 1) {
                    return false;
                }
                increaseTag = 0;
            } else if (A[i - 1] < A[i]) { // 递增
                if (increaseTag == 0) {
                    return false;
                }
                increaseTag = 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2};
        System.out.println("isMonotonic:" + isMonotonic(A));
    }
}
