package leetcode;

import java.math.BigInteger;

/**
 * Created by solie_h on 2018/12/28.
 */
public class AddBinary67 {

    public static String addBinary(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        if (b.length() == 0) {
            return a;
        }

        int maxLength;
        if (a.length() > b.length()) {
            maxLength = a.length() + 1;
        } else {
            maxLength = b.length() + 1;
        }


        int[] aArray = new int[maxLength];
        aArray[0] = 0;
        for (int i = 0; i < a.length(); i++) {
            aArray[aArray.length - 1 - i] = a.charAt(a.length() - 1 - i) - 48;
        }

        int[] bArray = new int[maxLength];
        bArray[0] = 0;
        for (int i = 0; i < b.length(); i++) {
            bArray[bArray.length - 1 - i] = b.charAt(b.length() - 1 - i) - 48;
        }


        int[] resultArray = new int[maxLength];


        for (int i = resultArray.length - 1; i >= 0; i--) {

            int s = aArray[i] + bArray[i];

            if (resultArray[i] + s == 2) {
                resultArray[i] = 0;
                resultArray[i - 1] = 1;
            }else if (resultArray[i] + s == 3){
                resultArray[i] = 1;
                resultArray[i - 1] = 1;
            }else {
                resultArray[i] += s;
            }


        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < resultArray.length; i++) {
            if (i == 0 && resultArray[i] == 0) {
                continue;
            }
            sb.append(resultArray[i]);
        }

        return sb.toString();


    }

    public static void main(String[] args) {


        System.out.println(addBinary("1111", "1111"));
    }
}
