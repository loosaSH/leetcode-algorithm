package leetcode;

/**
 * Created by solie_h on 2019/1/8.
 */
public class MySqrt69 {

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        for (double i = 1; i <= x; i++) {
            double tmp = x / i;
            if (tmp == i){
                return (int) i;
            }
            if(tmp < i){
                return (int) i-1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

}
