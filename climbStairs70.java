package leetcode;

import java.util.Map;

/**
 * Created by solie_h on 2019/1/19.
 */
public class climbStairs70 {


    public static int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//
//        int sum = 0;
//        int sum1 = 1;
//        int sum2 = 2;
//        for (int i = 3; i <= n; i++) {
//            sum = sum1+sum2;
//            sum1 = sum2;
//            sum2 = sum;
//        }
//        return sum;

        double b = Math.sqrt(5);
        n = n+1;
        double a = (1/b)*(Math.pow((1+b)/2,n) - Math.pow((1-b)/2,n));
        return (int) a;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
