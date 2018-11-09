package leetcode;

/**
 * 7  Reverse Integer
 * Created by solie_h on 2018/11/4.
 */
public class ReverseInteger {

    public static int reverse(int x) {

        StringBuilder sb = new StringBuilder();

        long y = x;

        if (y < 0) {
            sb.append("-");
            y = -y;
        }


        do {
            sb.append(y % 10);
            y = y / 10;
        } while (y >= 1);

        if(Long.parseLong(sb.toString())>Integer.MAX_VALUE
                ||Long.parseLong(sb.toString())<Integer.MIN_VALUE){
            return 0;
        }


        return Integer.parseInt(sb.toString());

    }


//    public static int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
//    }

    public static void main(String[] args) {

        int x = -214748364;

        int y = reverse(x);

        System.out.println(y);

    }

}
