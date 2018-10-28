package leetcode;

/**
 * 转换小写， 709
 * Created by solie_h on 2018/10/28.
 */
public class ToLowCase709 {

    public static String toLowerCase(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int a = (int) (str.charAt(i));
            if (a >= 65 && a <= 90) {
                a = a + (97 - 65);
            }
            sb.append((char)a);
        }
        return sb.toString();
    }


    public static void main(String[] args){
        String str = "HosInd123I";
        System.out.println(toLowerCase(str));
    }

}
